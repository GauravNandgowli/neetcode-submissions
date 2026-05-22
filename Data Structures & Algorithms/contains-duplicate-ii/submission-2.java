class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int start = 0, end = 0;
        while (end < nums.length) {
             if (set.contains(nums[end]))
                return true;
                
            set.add(nums[end]);

            if (Math.abs(start - end) >= k) {
                set.remove(nums[start]);
                start++;
            }

           

            end++;
        }
        return false;
    }
}