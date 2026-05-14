class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[nums.length * 2];
        int startingPointer = 0, midPointer = nums.length ;

        while(midPointer < ans.length ){

            ans[startingPointer] = nums[startingPointer];
            ans[midPointer++] = nums[startingPointer];
            startingPointer++;

           
        }

        return  ans;
        
    }
}