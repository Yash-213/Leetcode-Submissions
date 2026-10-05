class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> sk = new Stack<>();
        sk.push(0);

        for (char c : s.toCharArray()) {
            if (c == '(') {
                sk.push(0);
            } else {
                int top = sk.pop();
                int a = (top == 0) ? 1 : 2 * top;
                sk.push(sk.pop() + a);
            }
        }
        return sk.pop();
    }
}