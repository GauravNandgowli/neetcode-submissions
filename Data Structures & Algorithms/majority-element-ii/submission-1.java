class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int can1 = -1, can2 = -1, cnt1 = 0, cnt2 = 0;
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (can1 == num) {
                cnt1++;
            } else if (can2 == num) {
                cnt2++;
            } else if (cnt1 == 0) {
                cnt1 = 1;
                can1 = num;
            } else if (cnt2 == 0) {
                cnt2 = 1;
                can2 = num;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = cnt2 = 0;
        for (int num : nums) {
            if (num == can1) {
                cnt1++;
            } else if (num == can2) {
                cnt2++;
            }
        }

        if (cnt1 > nums.length / 3)
            res.add(can1);
        if (cnt2 > nums.length / 3)
            res.add(can2);

        return res;
    }
}