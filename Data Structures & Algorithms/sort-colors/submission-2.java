class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length - 1, scanner = 0;
        while (scanner <= two) {
            if (nums[scanner] == 2) {
                int temp = nums[two];
                nums[two] = nums[scanner];
                nums[scanner] = temp;
                two--;
                
            } else if (nums[scanner] == 0) {
                int temp = nums[zero];
                nums[zero] = nums[scanner];
                nums[scanner] = temp;
                zero++;
                scanner++;
            } else
                scanner++;
        }
    }
}