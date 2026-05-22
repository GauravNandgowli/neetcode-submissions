// import java.util.Arrays;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        int i = 0;
        int[][] arr = new int[map.size()][2];
        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
            int[] local = new int[2];
            local[0] = ent.getKey();
            local[1] = ent.getValue();
            arr[i++] = local;
        }
        Arrays.sort(arr, Comparator.comparingInt((int[] a) -> a[1]).reversed());
        int[] res = new int[k];
        for (int j = 0; j < k; j++) {
            res[j] = arr[j][0];
        }
        return res;
    }
}
