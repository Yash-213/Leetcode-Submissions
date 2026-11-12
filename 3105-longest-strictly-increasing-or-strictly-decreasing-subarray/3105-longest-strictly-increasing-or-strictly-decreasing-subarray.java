class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int l = 1;
        int max = 1;
        int countI = 1;
        int countD = 1;

        while (l < nums.length) {
            if (nums[l] < nums[l - 1]) {
                countD++;
                countI = 1;
            } 
            else if (nums[l] > nums[l - 1]) {
                countI++;
                countD = 1;
            } 
            else {
                countI = 1;
                countD = 1;
            }
            max = Math.max(max, Math.max(countI, countD));
            l++;
        }
        return max;
    }
}