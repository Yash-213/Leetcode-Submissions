class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long[] sum = new long[n];
        sum[0] = nums[0];
        for(int i=1;i<n;i++) sum[i] = sum[i-1] + nums[i];
        long max = Long.MIN_VALUE;
        int min = nums[n-1];
        for(int i = n - 2; i >= 0; i--) {
            min = Math.min(min, nums[i+1]);
            max = Math.max(max, sum[i] - min);
        }
        return max;
    }
}