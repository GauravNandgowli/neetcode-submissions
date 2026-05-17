class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finres = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int start = i + 1, end = nums.length -1;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            while (start < end) {
                List<Integer> localRes = new ArrayList<>();
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    localRes.add(nums[i]);
                    localRes.add(nums[start]);
                    localRes.add(nums[end]);
                    finres.add(localRes);
                    int left = nums[start];
                    int right = nums[end];
                    while(start < end && nums[start] == left)start++;
                    while(end > 0 && nums[end] == right)end--;
                 
                } else if (sum > 0)
                    end--;
                else
                    start++;
            }
        }

        return finres;
    }
}
