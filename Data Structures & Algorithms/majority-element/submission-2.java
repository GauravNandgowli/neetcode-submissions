class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0], scanner = 0, count =0;

        while(scanner < nums.length){
            if(nums[scanner] != candidate){
                count--;
            }else count++;
            if(count == 0){
                candidate = nums[scanner];
                count++;
            }
            
            scanner++;
        }
        
        return candidate;
    }
}