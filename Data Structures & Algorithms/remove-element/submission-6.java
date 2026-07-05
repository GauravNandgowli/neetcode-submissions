class Solution {
    public int removeElement(int[] nums, int val) {
        int read = nums.length - 1, write = 0;
        while (write <= read) {
            if (nums[write] == val) {
                int temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;
                read--;
            } else
                write++;
        }
        return write;
    }
}