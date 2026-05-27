class Solution {
    public int[] replaceElements(int[] nums) {
       int max = -1;

        for(int i = nums.length - 1; i >= 0; i--) {
            int current = nums[i];
            nums[i] = max;
            max = Math.max(max, current);
        }

        return nums;
    }
}