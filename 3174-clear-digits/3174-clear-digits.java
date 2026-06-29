class Solution {
    public String clearDigits(String s) {
        Stack<Character> sk = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!sk.empty() && Character.isDigit(ch)) sk.pop();
            else sk.push(ch);
        }

        StringBuilder str = new StringBuilder();
        while (!sk.empty()) str.append(sk.pop());
        
        return str.reverse().toString();
    }
}