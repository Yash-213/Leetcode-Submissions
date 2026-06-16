class Solution {
    public int reinitializePermutation(int n) {
        int ope = 0, a = 1;
        while (ope == 0 || a > 1) {
            if (a < n /2) a *= 2;
            else a = (a - n / 2) * 2 + 1;
            ope++;
        }
        return ope;
    }
}