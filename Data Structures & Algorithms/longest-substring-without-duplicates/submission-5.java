class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        int start = 0, end = 0, max = 1, count = 0;
        Map<Character, Integer> map = new HashMap<>();
        count++;
        while (end < s.length()) {
            while (map.containsKey(s.charAt(end))) {
                map.computeIfPresent(s.charAt(start), (k, v) -> v == 1 ? null : v - 1);
                start++;
                count--;
            }
            map.merge(s.charAt(end), 1, Integer::sum);
            max = Math.max(max, count);
            count++;
            end++;
        }
        return max;
    }
}
