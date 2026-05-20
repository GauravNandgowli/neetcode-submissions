class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
          int n = arr.length;

        // First window sum
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += Math.abs(arr[i] - x);
        }

        int minSum = windowSum;
        int startIndex = 0;

        // Sliding window
        for (int end = k; end < n; end++) {

            windowSum += Math.abs(arr[end] - x);
            windowSum -= Math.abs(arr[end - k] - x);

            // Keep FIRST minimum window
            if (windowSum < minSum) {
                minSum = windowSum;
                startIndex = end - k + 1;
            }
        }

        List<Integer> res = new ArrayList<>();

        for (int i = startIndex; i < startIndex + k; i++) {
            res.add(arr[i]);
        }

        return res;
    }
}