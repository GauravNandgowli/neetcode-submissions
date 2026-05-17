class Solution {
    public int majorityElement(int[] nums) {
        int maxAppearance = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
            if(map.get(nums[i]) > maxAppearance) return nums[i];
        }
        // int max = Integer.MIN_VALUE;
        int majorElement = 0;
        // for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
        //     if (ent.getValue() > max) {
        //         max = ent.getValue();
        //         majorElement = ent.getKey();
        //     }
        // }

        return majorElement;
    }
}