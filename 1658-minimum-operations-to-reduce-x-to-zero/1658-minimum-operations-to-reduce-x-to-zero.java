class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;

        int a = -x;
        for (int num : nums) a += num;

        if (a < 0) return -1;
        if (a == 0) return n;

        int count = -1, idx = 0, s = 0;
        for (int i = 0; i < n; i++) {
            s += nums[i];
            while (s > a) s -= nums[idx++];

            if (s == a) count = Math.max(count, i - idx + 1);
        }
        return count < 0 ? -1 : n - count;
    }
}