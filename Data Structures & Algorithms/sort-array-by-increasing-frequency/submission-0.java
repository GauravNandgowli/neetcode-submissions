class Solution {
    public int[] frequencySort(int[] nums) {
          Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }
        int[][] arr = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
            arr[i][0] = ent.getKey();
            arr[i][1] = ent.getValue();
            i++;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0]; 
            }
            return a[1] - b[1]; 
        });
        int[] res = new int[nums.length];
        int idx = 0;

        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j][1]; k++) {
                res[idx++] = arr[j][0];
            }
        }

        return res;

        
    }
}