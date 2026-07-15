class Solution {
    public long[] findPrefixScore(int[] nums) {
        long sum = 0;
        long max = nums[0];
        long[] conver = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
            sum += nums[i] + max;
            conver[i] = sum;
        }
        return conver;
    }
}