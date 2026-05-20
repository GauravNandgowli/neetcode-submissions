class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0;
        int sum = 0, min = Integer.MAX_VALUE;
        while (end < nums.length) {
            sum = sum + nums[end];
            while (sum >= target) {
            min = Math.min(end - start + 1, min);
                sum -= nums[start];
                start++;
            }
            end++;
        }
         return min == Integer.MAX_VALUE ? 0 : min;
    }
}