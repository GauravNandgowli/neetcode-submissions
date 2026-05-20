class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int start = 0, end = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (end < nums.length) {
            map.merge(nums[end], 1, Integer::sum);
            if (Math.abs(start - end) > k) {
                map.computeIfPresent(nums[start], (key, v) -> v == 1 ? null : v - 1);
                start++;
            }
            if (map.get(nums[end]) > 1 )
                return true;

            end++;
        }
        return false;
    }
}