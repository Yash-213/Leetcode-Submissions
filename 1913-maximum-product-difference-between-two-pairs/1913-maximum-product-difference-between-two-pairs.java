class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[n - 1], b = nums[n - 2], c = nums[0], d = nums[1];
        return (a * b) - (c * d);
    }
}