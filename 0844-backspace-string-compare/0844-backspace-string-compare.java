class Solution {
    public boolean backspaceCompare(String s, String t) {
        return remover(s).equals(remover(t));
    }
    private static String remover (String s) {
        Stack<Character> sk = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!sk.empty() && c == '#') sk.pop();
            else if (c != '#') sk.push(c);
        }
        StringBuilder str = new StringBuilder();
        while (!sk.empty()) str.append(sk.pop());

        return str.toString();
    }
}