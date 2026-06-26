class Solution {
    public int maxDepth(String s) {
        Stack<Character> sk = new Stack<>();
        int max = 0;
        int bestMax= 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                sk.push(c);
                max++;
            } else if (c == ')') {
                sk.pop();
                max--;
            }
            bestMax = Math.max(max, bestMax);
        }
        return bestMax;
    }
}