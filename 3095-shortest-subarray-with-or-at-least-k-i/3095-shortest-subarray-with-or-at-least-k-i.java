class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int a = 0;
            for (int j = i; j < nums.length; j++) {
                a |= nums[j];
                if (a >= k) len = Math.min(len, j - i + 1);
            }
        }
        return len == Integer.MAX_VALUE ? -1 : len;
    }
}