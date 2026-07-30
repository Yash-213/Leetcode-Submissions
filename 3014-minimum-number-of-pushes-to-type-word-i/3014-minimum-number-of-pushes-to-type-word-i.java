class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if (n < 9) return n;
        if (n > 8 && n < 17) return 2 * n - 8;
        if (n > 16 && n < 25) return 3 * n - 24;
        return 4 * n - 48;
    }
}