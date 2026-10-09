class Solution {
    public int minInsertions(String s) {
        Stack<Character> sk = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') sk.push(ch);
            else {
                if (i < s.length() - 1 && s.charAt(i + 1) == ')') i++;
                else count++;
                if (sk.isEmpty()) count++;
                else sk.pop();
            }
        }
        return count + sk.size() * 2;
    }
}