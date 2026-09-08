class Solution {
    public String removeOuterParentheses(String s) {
        String str = "";
        Stack<Character> sk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (sk.size() != 0) str += '(';
                sk.push(c);
            } else {
                sk.pop();
                if (sk.size() != 0) str += ')';
            }
        }
        return str;
    }
}