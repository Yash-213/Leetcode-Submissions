class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = n * (n + 1);
        int oddSum = n * n;

        return gcd(evenSum, oddSum);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}