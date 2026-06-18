class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            StringBuilder check = new StringBuilder();
            for (int j = i; j < i + sorted.length(); j++) {
                check.append(s2.charAt(j));
            }
            chars = check.toString().toCharArray();
            Arrays.sort(chars);
            String two = new String(chars);
            if (two.equals(sorted))
                return true;
        }

        return false;
    }
}
