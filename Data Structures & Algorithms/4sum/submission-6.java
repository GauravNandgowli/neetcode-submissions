class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> finres = new ArrayList<>();
        for (int j = 0; j < nums.length - 2; j++) {
            if (j > 0 && nums[j] == nums[j - 1])
                continue;
            for (int i = j + 1; i < nums.length - 1; i++) {
                if (i > j +1 && nums[i] == nums[i - 1])
                    continue;
                int start = i + 1, end = nums.length - 1;
                while (start < end) {
                    List<Integer> localRes = new ArrayList<>();
                    long sum = (long)nums[j] + nums[i] + nums[start] + nums[end];
                    if (sum == target) {
                        localRes.add(nums[j]);
                        localRes.add(nums[i]);
                        localRes.add(nums[start]);
                        localRes.add(nums[end]);
                        finres.add(localRes);
                        int left = nums[start];
                        int right = nums[end];
                        while (start < end && nums[start] == left) start++;
                        while (end > 0 && nums[end] == right) end--;

                    } else if (sum > target)
                        end--;
                    else
                        start++;
                }
            }
        }

        return finres;
    }
}