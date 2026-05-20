class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int start = 0, end = 0, req = s1.length();
        int[] frq = new int[26];
        for (char c : s1.toCharArray()) {
            frq[c - 'a']++;
        }
        while (end < s2.length()) {
            char r = s2.charAt(end);
            frq[r - 'a']--;
            if (frq[r - 'a'] >= 0)
                req--;
            if (end - start + 1 > s1.length()) {
                char l = s2.charAt(start);
                frq[l - 'a']++;
                if (frq[l - 'a'] > 0)
                    req++;
                start++;
            }
            if (req == 0)
                return true;
            end++;
        }
        return false;
    }
}
