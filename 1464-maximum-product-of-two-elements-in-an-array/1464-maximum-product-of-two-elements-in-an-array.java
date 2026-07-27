class Solution {
    public int maxProduct(int[] nums) {
        int max = 0, max1 = 0;
        for (int n : nums) {
            if (n > max) {
                max1 = max;
                max = n;
            } else if (max1 < n) max1 = n;
        }
        return (max - 1) * (max1 - 1);
    }
}