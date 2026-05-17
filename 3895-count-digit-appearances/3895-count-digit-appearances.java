class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for (int n : nums) count += digitCount(n, digit);
        return count;
    }
    static int digitCount(int n, int digit) {
        int count = 0;
        while(n > 0) {
            int d = n % 10;
            if(digit == d) count++;
            n /= 10;
        }
        return count;
    }
}