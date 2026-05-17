class Solution {
    public int maxArea(int[] heights) {
        int start = 0, end = heights.length - 1, max = Integer.MIN_VALUE;
        while (start < end) {
            int distance = end - start;
            int volume = Math.min(heights[start], heights[end]) * distance;
            max = Math.max(volume, max);
            if (heights[start] == heights[end]) {
                start++;
                end--;
            }
            else if (heights[start] < heights[end])
                start++;
            else
                end--;
        }
        return max;
    }
}
