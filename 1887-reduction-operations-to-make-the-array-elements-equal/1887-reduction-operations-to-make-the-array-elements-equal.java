class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int ope = 0;
        for(int i = nums.length - 1; i > 0; i--)
            if(nums[i - 1] != nums[i]) ope += nums.length - i;
        return ope;
    }
}