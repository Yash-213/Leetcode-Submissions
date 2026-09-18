class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        Stack<Integer> sk = new Stack<>();

        int l = 0;
        int idx = 0;

        while (l < n && idx < n) {

            sk.push(pushed[l++]);

            while (!sk.isEmpty() && sk.peek() == popped[idx]) {
                sk.pop();
                idx++;
            }
        }

        return sk.isEmpty();
    }
}