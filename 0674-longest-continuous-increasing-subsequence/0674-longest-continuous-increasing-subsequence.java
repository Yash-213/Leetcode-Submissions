class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int l = 0, r = 1;
        int count = 0;
        while(r < nums.length) {
            if(nums[r] > nums[r - 1]) {
                r++;
            }
            else {
                count = Math.max(count, r - l);
                l = r;
                r++;
            }
        }
        count = Math.max(count, r - l);
        return count;
    }
}