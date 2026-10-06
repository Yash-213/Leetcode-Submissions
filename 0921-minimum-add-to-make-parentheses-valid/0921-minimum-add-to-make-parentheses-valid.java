class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> sk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!sk.isEmpty() && ch != sk.peek())
                    sk.pop();
                else
                    sk.push(ch);
            } else
                sk.push(ch);
        }
        return sk.size();
    }
}