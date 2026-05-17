class Solution {
    public int removeDuplicates(int[] nums) {
        int reader = 1, writer = 1;
        int prev = 0;
        while (reader < nums.length) {
            if (nums[prev] != nums[reader]) {
                nums[writer] = nums[reader];
                writer++;
                prev++;
            }

            reader++;
        }
        return writer;
    }
}