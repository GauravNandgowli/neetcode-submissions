class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int i = 0;
        int count = 1;
        while (i < nums.length) {
            while (i < nums.length - 1 && nums[i] == nums[i + 1])
                i++;
            if (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
            i++;

        }

        return max;
    }
}
