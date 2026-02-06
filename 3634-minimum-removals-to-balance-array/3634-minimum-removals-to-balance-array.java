class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int r = 0, size = 0;
        for(int i = 0; i < nums.length; i++){
            while((long) nums[i] > (long) nums[r] * k) r++;
            size = Math.max(size, i - r + 1);
        }
        return nums.length - size;
    }
}