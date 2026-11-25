class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0)nums[i] *= (-1);
        }
        Arrays.sort(nums);
        long small = 0;
        long big = 0;
        for (int l = 0; l < n / 2; l++) {
            small += Math.pow(nums[l], 2);
        }
        for (int r = n / 2; r < n; r++) {
            big += Math.pow(nums[r], 2);
        }
        return big - small;
    }
}