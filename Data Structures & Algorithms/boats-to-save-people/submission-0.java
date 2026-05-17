class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int start = 0, count =0, end = nums.length -1;
        while(start <= end){
            if(nums[end] > limit){
                end--;
            }else if(nums[end] == limit){
                count++;
                end--;
            }else if( nums[end] < limit){
                if((nums[end] + nums[start]) <= limit){
                    count++;
                    start++;
                    end--;
                }else if((nums[end] + nums[start]) > limit){
                    count++;
                    end--;
                }
            }
        }
        return count;
    }
}