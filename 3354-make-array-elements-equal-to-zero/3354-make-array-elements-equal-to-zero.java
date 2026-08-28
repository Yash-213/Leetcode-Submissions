class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int[] sufix = new int[n];
        sufix[n - 1] = nums[n - 1];
        for (int i = n - 2; i > -1; i--) {
            sufix[i] = sufix[i + 1] + nums[i];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0 && prefix[i] == sufix[i]) count += 2;
            else if (nums[i] == 0 && Math.abs(prefix[i] - sufix[i]) == 1) count++;
        }
        return count;
    }
}