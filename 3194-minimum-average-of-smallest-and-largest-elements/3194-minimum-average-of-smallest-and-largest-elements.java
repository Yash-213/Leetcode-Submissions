class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            min = Math.min((double)(nums[i]+nums[nums.length-1-i])/2, min);
        }
        return min;
    }
}