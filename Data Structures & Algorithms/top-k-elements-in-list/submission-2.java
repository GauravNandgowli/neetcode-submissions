class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }
        List<Integer>[] arr = new ArrayList[nums.length +1];

        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {

            if (arr[ent.getValue()] == null) {
                arr[ent.getValue()] = new ArrayList<>();
            }

            arr[ent.getValue()].add(ent.getKey());
        }

       

        int [] res = new int [k];
        int count = k , scanner = arr.length - 1, i =0;
        while (count > 0 && scanner > 0) {

            if (arr[scanner] != null) {
                for (int n : arr[scanner]) {
                      if (count == 0) break;
                  res[i++] = n;
                  count--;
                }

            }

            scanner--;

        }

        return res;
    }
}
