class Solution {
    public int search(int[] nums, int target) {
        return search1(nums, target, 0, nums.length - 1);
    }
    static int search1(int[] nums, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if (nums[m] == target) {
            return m;
        }
        if (nums[s] <= nums[m]) {
            if(target >= nums[s] && target <= nums[m]){
                return search1(nums, target, s, m-1);
            }else {
                return search1(nums, target, m + 1, e);
            }
        }

        if (target >= nums[m] && target <= nums[e]) {
            return search1(nums, target, m + 1, e);
        }
        return search1(nums, target, s, e-1);
    }
}