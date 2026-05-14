class Solution {
    public int appendCharacters(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        int sPointer = 0, tPointer = 0;

        while (sPointer < s_arr.length && tPointer < t_arr.length) {
            if (s_arr[sPointer] == t_arr[tPointer]) {
                sPointer++;
                tPointer++;
            } else if (t_arr[tPointer] != s_arr[sPointer]) {
                sPointer++;
            }
        }

        if (tPointer >= t_arr.length)
            return 0;
        else
            return t_arr.length - tPointer ;
    }
}