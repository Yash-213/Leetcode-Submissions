class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2], move = 0;
        for(int num : nums) {
            move += Math.abs(mid - num);
        }
        return move;
    }
}