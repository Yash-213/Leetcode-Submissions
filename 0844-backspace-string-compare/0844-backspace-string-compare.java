class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!sk.empty() && ch == '#') sk.pop();
            else if (ch != '#') sk.push(ch);
        }
        String a = "";
        while (!sk.empty()) {
            a += sk.pop();
        }
        for (char ch : t.toCharArray()) {
            if (!sk.empty() && ch == '#') sk.pop();
            else if (ch != '#') sk.push(ch);
        }
        if (a.length() != sk.size()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != sk.peek()) return false;
            sk.pop();
        }
        return true;
    }
}