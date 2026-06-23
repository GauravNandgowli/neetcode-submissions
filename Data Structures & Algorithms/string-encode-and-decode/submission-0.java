class Solution {
    public String encode(List<String> strs) {
        // if (strs.length == 0)
        //     return strs;
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            StringBuilder len = new StringBuilder();
            len.append(str.length());
            len.append("#");
            len.append(str);
            res.append(len);
        }

        return new String(res);
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {

        StringBuilder wordLen = new StringBuilder();

        while (str.charAt(i) != '#') {
            wordLen.append(str.charAt(i));
            i++;
        }

        int len = Integer.parseInt(wordLen.toString());

        int beginIndex = i + 1;
        int endIndex = beginIndex + len;

        res.add(str.substring(beginIndex, endIndex));

        i = endIndex;
    }
        return res;
    }
}
