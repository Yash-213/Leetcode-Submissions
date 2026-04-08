class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        final int Mod = 1_000_000_007;
        for(int[] querie : queries) {
            for(int i = querie[0]; i <= querie[1]; i += querie[2]) {
                long product = (long)nums[i] * querie[3];
                nums[i] = (int)(product % Mod);
            }
        }
        int xor = 0;
        for(int n : nums) {
            xor ^= n;
        }
        return xor;
    }
}