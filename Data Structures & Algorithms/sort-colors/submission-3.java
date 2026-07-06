class Solution {
    public void sortColors(int[] nums) {
        int scanner = 0, zero = 0, two = nums.length - 1;
        while (scanner <= two) {
            if (nums[scanner] == 0) {
                int temp = 0;
                temp = nums[zero];
                nums[zero++] = nums[scanner];
                nums[scanner++] = temp;
            } else if (nums[scanner] == 2) {
                int temp = 0;
                temp = nums[two];
                nums[two--] = nums[scanner];
                nums[scanner] = temp;
            } else {
                scanner++;
            }
        }
    }
}