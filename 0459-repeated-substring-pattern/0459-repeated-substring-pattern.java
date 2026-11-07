class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        if (n == 1) return false;

        int l = 1, len = 0;
        int[] lps = new int[n];
        while (l < n) {
            if (s.charAt(l) == s.charAt(len)) {
                lps[l++] = ++len;
            } else {
                if (len != 0) len = lps[len - 1];
                else lps[l++] = 0;
            }
        }
        int ans = lps[n - 1];
        return ans > 0 && (n % (n - ans) == 0);
    }
}