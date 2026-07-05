class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        String firstWord = strs[0];

        for (int i = 0; i < firstWord.length(); i++) {
            for (String s : strs) {
                if (i == s.length() || firstWord.charAt(i) != s.charAt(i))
                    return s.substring(0, i);
            }
        }
        return firstWord;
    }
}