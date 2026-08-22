class Solution {
    public boolean checkDivisibility(int n) {
        if (n % (sum(n) + product(n)) == 0) return true;
        return false;
    }
    private static int sum (int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    private static int product (int n) {
        int prod = 1;
        while (n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }
}