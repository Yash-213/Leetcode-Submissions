class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> sk = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!sk.isEmpty() && arr[i] > arr[sk.peek()]) {
                int idx = sk.pop();
                ans[idx] = i - idx;
            }
            sk.push(i);
        }
        return ans;
    }
}