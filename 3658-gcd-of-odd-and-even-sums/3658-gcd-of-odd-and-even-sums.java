class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = n * (n + 1);
        int oddSum = n * n;

        return gcd(evenSum, oddSum);
    }

    static int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b % a, a);
    }
}