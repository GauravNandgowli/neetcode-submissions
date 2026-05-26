class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            while (start < end && !isAl(arr[start])) start++;
            while (end > start && !isAl(arr[end])) end--;
            if (Character.toLowerCase(arr[start]) != Character.toLowerCase(arr[end]))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public boolean isAl(char c) {
        return Character.isLetterOrDigit(c);
    }
}
 