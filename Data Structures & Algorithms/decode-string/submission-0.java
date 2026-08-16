class Solution {
    public String decodeString(String s) {
        Deque<String> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            //"2[a3[bc]]c"

            if (c == ']') {
                StringBuilder temp = new StringBuilder();
                while (!stack.isEmpty() && !stack.peek().equals("[")) {
                    temp.insert(0, stack.pop());
                }
                stack.pop();
                // int count = 0;
                // while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                //     count = count * 10 + Character.getNumericValue(stack.pop());
                // }321
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    sb.append(stack.pop());
                }

                sb.reverse();

                int num = Integer.parseInt(sb.toString());

                stack.push(temp.toString().repeat(num));
            } else {
                stack.push(String.valueOf(c));
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }

        return res.toString();
    }
}