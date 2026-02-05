class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            if (nums[i] < 0) {
                int a = i + nums[i];
                while (a < 0) {
                    a += n;
                }
                result[i] = nums[a];

            } else if (nums[i] == 0) {
                result[i] = nums[i];

            } else {
                int a = i + nums[i];
                while (a >= n) {
                    a -= n;
                }
                result[i] = nums[a];
            }
        }
        return result;
    }
}
