class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        int l = 0, r = l;
        int sum = 0;
        while (r < nums.length) {
            while (l < r && r - l + 1 > k) {
                sum -= nums[l];
                l++;
            }
            
            sum += nums[r];
            if (r - l + 1 == k) 
                max = Math.max(max, ((double) sum / k));

            r++;
        }
        return max;
    }
}