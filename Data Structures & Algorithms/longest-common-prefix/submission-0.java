class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minLenStrs = strs[0];

        for (String str : strs) {
            if (str.length() < minLenStrs.length())
                minLenStrs = str;
        }

        int right = minLenStrs.length();
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            int j = 0;
            while (j < right) {
                if (minLenStrs.charAt(j) != word.charAt(j)) {
                   
                right = j;
                    break;
                }
                j++;
            }
        }
        StringBuilder res = new StringBuilder("");
        System.out.println(right);
        
       
        for (int i = 0; i < right; i++) {
            res.append(minLenStrs.charAt(i));
        }
        return res.toString();
    }
}