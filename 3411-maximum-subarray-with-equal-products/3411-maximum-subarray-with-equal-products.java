class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int len = 0;

        for (int l = 0; l < n; l++) {
            int prod = 1;
            int gcd = 0;
            int lcm = 1;

            for (int r = l; r < n; r++) {
                int x = nums[r];

                prod *= x;
                gcd = gcd(gcd, x);
                lcm = (lcm / gcd(lcm, x)) * x;

                if (prod == lcm * gcd) 
                    len = Math.max(len, r - l + 1);
            }
        }

        return len;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}