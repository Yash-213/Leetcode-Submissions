class Solution {
    public int longestIdealString(String s, int k) {
        int[] arr = new int[26];
        int ans = 0;
        for(char ch : s.toCharArray()) {
            int curr = ch - 'a';
            int len = 0;
            for(int i = Math.max(0,curr-k); i <= Math.min(25,curr+k); i++)
                len = Math.max(len, arr[i]);
            arr[curr] = len + 1;
            ans = Math.max(ans, arr[curr]);
        }
        return ans;
    }
}