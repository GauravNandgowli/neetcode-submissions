class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (i < nums.length) {
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);
            i++;
        }
        return false;
    }
}