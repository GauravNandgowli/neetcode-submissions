class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
            if (ent.getValue() > (nums.length / 3))
                res.add(ent.getKey());
        }

        return res;
    }
}