class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean zero = true;
        for (int num : nums) {
            if (num != 0) zero = false;
            xor ^= num;
        }
        if (zero) return 0;
        if (xor > 0) return nums.length;
        return nums.length - 1;
    }
}