class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int l = 0, r = nums.length - 1;
        while (l < r) {
            sum += concate (nums[l], nums[r]);
            l++;
            r--;
        }
        if (r == l) sum += nums[l];
        return sum;
    }
    private static long concate(int a, int b) {
        int len = digitLen(b);
        double pow = Math.pow(10, len);
        long c = (long)((a * pow) + b);
        return c;
    }
    private static int digitLen (int b) {
        int len = 0;
        while (b > 0) {
            len++;
            b /= 10;
        }
        return len;
    }
}