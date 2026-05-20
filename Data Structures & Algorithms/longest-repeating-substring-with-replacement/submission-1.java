class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0, end = 0, maxFreq = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (end < s.length()) {
            map.merge(s.charAt(end), 1, Integer::sum);
            maxFreq = Math.max(map.get(s.charAt(end)), maxFreq);
            while ((end - start +1) - maxFreq > k) {
                map.computeIfPresent(s.charAt(start), (key, v) -> v == 1 ? null : v - 1);
                start++;
            }
            max = Math.max(max, end - start + 1);
            end++;
        }
        return max;
    }
}
