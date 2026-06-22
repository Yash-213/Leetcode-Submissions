class Solution {
    public String removeStars(String s) {
        Stack<Character> sk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && !sk.empty()) sk.pop();
            else sk.push(s.charAt(i));
        }

        StringBuilder str = new StringBuilder();
        while(!sk.empty()) str.append(sk.pop());

        return str.reverse().toString();
    }
}