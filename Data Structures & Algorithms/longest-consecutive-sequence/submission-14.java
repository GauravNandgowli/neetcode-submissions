class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        int max = 1;
        Arrays.sort(nums);
        int cnt = 1, end = 1;

        while (end < nums.length) {
            while (end < nums.length && nums[end] == nums[end - 1]) {
                end++;
            }
            if (end < nums.length && Math.abs(nums[end] - nums[end - 1]) == 1) {
                cnt++;
                max = Math.max(cnt, max);

            } else {
                cnt = 1;
            }
            end++;
        }
        return max;
    }
}
