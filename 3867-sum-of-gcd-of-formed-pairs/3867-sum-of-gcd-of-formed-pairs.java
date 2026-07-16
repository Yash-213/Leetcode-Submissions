class Solution {
    public long gcdSum(int[] nums) {
        long[] prefix = new long[nums.length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            prefix[i] = gcd(max, nums[i]);
        }
        Arrays.sort(prefix);
        int l = 0, r = prefix.length - 1;
        long sum = 0;
        while (l < r) {
            sum += gcd(prefix[l], prefix[r]);
            l++;
            r--;
        }
        return sum;
    }
    private static long gcd (long a, long b)  {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}