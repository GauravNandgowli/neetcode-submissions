class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }
        int max = 1;
        
        for(int i = 0; i < nums.length;i++){
        int cnt = 1;
            int curr = nums[i];
            while(set.contains(curr  + 1)){
                cnt++;
                max = Math.max(max , cnt);  
                curr++;              
            }             
            

        }

        return max;
    }
}
