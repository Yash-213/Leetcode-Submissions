class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] max = new int[n];
        int[] ans = new int[n];
        max[0] = nums[0];
        for (int i = 1; i < n; i++) max[i] = Math.max(max[i - 1], nums[i]);
        int min = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (max[i] > min) ans[i] = (i == n - 1) ? max[i] : ans[i + 1];
            else ans[i] = max[i];
            min = Math.min(min, nums[i]);
        }
        return ans;
    }
}