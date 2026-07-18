class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return gcd (min, max);
    }
    private static int gcd (int a, int b) {
        if (a == 0) return b;
        return gcd (b % a, a);
    }
}