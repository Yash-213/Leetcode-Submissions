class Solution {
    public int maxProduct(int n) {
        int max = 0, max1 = 0;
        while (n > 0) {
            int a = n % 10;
            if (a > max) {
                max1 = max;
                max = a;
            } else if (a > max1) 
                max1 = a;
            n /= 10;
        }
        return max * max1;
    }
}