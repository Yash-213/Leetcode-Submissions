class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l] * -1 == nums[r]) return nums[r];
            else if (nums[l] * -1 > nums[r]) l++;
            else r--;
        }
        return -1;
    }
}