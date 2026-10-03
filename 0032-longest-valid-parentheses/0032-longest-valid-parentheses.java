class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base index

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(')
                stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty())
                    stack.push(i); // New base
                else
                    maxLen = Math.max(maxLen, i - stack.peek());
            }
        }
        return maxLen;
    }
}