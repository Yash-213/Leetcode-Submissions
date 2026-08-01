class Solution {
    public boolean predictTheWinner(int[] nums) {
        return winner(nums, 0, nums.length - 1) >= 0;
    }
    
    private int winner(int[] nums, int i, int j) {
        if (i == j) return nums[i];
        
        int l = nums[i] - winner(nums, i + 1, j);
        int r = nums[j] - winner(nums, i, j - 1);
        
        return Math.max(l, r);
    }
}