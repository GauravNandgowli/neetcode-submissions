class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        // List<List<Integer>> arr = new ArrayList<>();
        // Collections.sort(arr);

        // for (Map.Entry<String, Integer> ent : map.entrySet()) {
        //     arr.add(ent.getKey());
        //     arr.add(ent.getValue());
        // }
        List<Map.Entry<Integer, Integer>> arr = new ArrayList<>(map.entrySet());
        arr.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        int[] res = new int[k];
        int j = 0;
        for (int i = 0; i < k; i++) {
            res[j++] = arr.get(i).getKey();
        }

        return res;
    }
}
