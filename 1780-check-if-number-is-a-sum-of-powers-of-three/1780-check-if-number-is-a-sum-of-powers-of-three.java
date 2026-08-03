class Solution {
    public boolean checkPowersOfThree(int n) {
        for (int i = 16; i > -1; i--) {
            double pow = Math.pow(3, i);
            if (n > pow) n -= pow;
            else if (n == pow) return true;
        }
        return false;
    }
}