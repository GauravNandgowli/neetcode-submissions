class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int end = 0, start = 0, max = 0;

        while (end < s.length()) {
             while(map.containsKey(s.charAt(end))) {
                map.computeIfPresent(s.charAt(start), (k, v) -> v == 1 ? null : v - 1);
                start++;
            }
            map.merge(s.charAt(end), 1, Integer::sum);
            max = Math.max(max, end - start + 1);
            end++;
        }

        return max;
    }
}
