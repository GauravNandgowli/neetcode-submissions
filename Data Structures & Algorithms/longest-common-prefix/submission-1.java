class Solution {
    public String longestCommonPrefix(String[] strs) {
        Set<String> set = new HashSet<>();
        String minStr = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minStr.length()) {
                minStr = strs[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : minStr.toCharArray()) {
            sb.append(c);
            set.add(sb.toString());
        }
        int max = minStr.length();
        String longestPrefix = minStr;
        for (int i = 0; i < strs.length; i++) {
            String currString = strs[i];

            int currStrLen = Math.min(currString.length(), max);

            while (currStrLen > 0) {
                if (set.contains(currString.substring(0, currStrLen))) {
                    if (currStrLen < max) {
                        max = currStrLen;

                        longestPrefix = currString.substring(0, currStrLen);
                    }

                    break;
                }

                currStrLen--;
            }

            if (currStrLen == 0) {
                return "";
            }
        }

        return longestPrefix;
    }
}