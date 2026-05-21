class Solution {
    public int removeElement(int[] nums, int val) {
        int read = 0, write = nums.length - 1;
        while (read <= write) {
           
            if (nums[read] == val) {
                int temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;
                write--;
            }else
            read++;
        }

        return read;
    }
}