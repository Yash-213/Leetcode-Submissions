class Solution {
    public String makeGood(String s) {
        Stack<Character> sk = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!sk.empty() && Math.abs(c - sk.peek()) == 32) sk.pop();
            else sk.push(c);
        }

        StringBuilder str = new StringBuilder();
        while (!sk.empty()) str.append(sk.pop());
        
        return str.reverse().toString();
    }
}