class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";
        int req = t.length();
        int[] freq = new int[128];

        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int scanner = 0, start = 0;
        String minStr = "";
        int minLen = Integer.MAX_VALUE;
        while (scanner < s.length()) {
            String min = "";

            char r = s.charAt(scanner);
            freq[r]--;

            if (freq[r] >= 0)
                req--;

            while (req == 0) {
                min = s.substring(start, scanner + 1);
                freq[s.charAt(start)]++;
                if (freq[s.charAt(start)] > 0)
                    req++;

                start++;
                minStr = minLen > min.length() ? min : minStr;
                if (minLen > min.length())
                    minLen = min.length();
            }

            scanner++;
        }
        return minStr;
    }
}
