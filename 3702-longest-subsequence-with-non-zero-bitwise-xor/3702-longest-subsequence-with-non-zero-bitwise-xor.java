class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean zero = true;
        for (int num : nums) {
            if (num != 0) zero = false;
            xor ^= num;
        }
        return zero ? 0 : xor > 0 ? nums.length : nums.length - 1;
    }
}