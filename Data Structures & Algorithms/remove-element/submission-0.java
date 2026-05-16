class Solution {
    public int removeElement(int[] nums, int val) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (val == nums[i]) {
                nums[i] = max;
            }
        }
        Arrays.sort(nums);
        int i = 0;
        while (i< nums.length && nums[i] != max) {
            i++;
        }
        return i ;
    }
}