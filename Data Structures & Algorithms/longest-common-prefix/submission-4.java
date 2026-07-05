class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minStr = strs[0];
        for (String str : strs) {
            if (minStr.length() > str.length())
                minStr = str;
        }
        StringBuilder temp = new StringBuilder();
        Set<String> mapSet = new HashSet<>();
        for (Character c : minStr.toCharArray()) {
            temp.append(c);
            mapSet.add(temp.toString());
        }

        String longestPrefix = "";
        int currStringlen = 0;
        int max = minStr.length();
        for (int i = 0; i < strs.length; i++) {
            String curString = strs[i];
            currStringlen = Math.min(curString.length(), max);
            while (currStringlen >= 0) {
                String testString = curString.substring(0, currStringlen);
                if (mapSet.contains(testString)) {
                    longestPrefix = testString;
                    max = currStringlen;
                    break;
                }
                currStringlen--;
            }
            if (currStringlen < 0)
                return "";
        }
        return longestPrefix;
    }
}