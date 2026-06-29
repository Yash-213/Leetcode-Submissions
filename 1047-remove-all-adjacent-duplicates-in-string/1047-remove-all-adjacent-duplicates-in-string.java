class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> sk = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!sk.empty() && ch == sk.peek()) sk.pop();
            else sk.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while (!sk.empty()) sb.append(sk.pop());
        
        return sb.reverse().toString();
    }
}