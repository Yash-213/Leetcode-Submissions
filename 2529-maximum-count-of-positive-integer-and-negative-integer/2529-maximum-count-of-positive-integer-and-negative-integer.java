class Solution {
    public int maximumCount(int[] nums) {
        int Ncount = 0, Pcount = 0;
        for (int n : nums) {
            if (n > 0) Pcount++;
            if (n < 0) Ncount++;
        }
        return Math.max(Pcount, Ncount);
    }
}