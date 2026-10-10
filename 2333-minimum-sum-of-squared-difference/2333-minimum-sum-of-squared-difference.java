class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long[] diff = new long[n];
        long operations = (long) k1 + k2;
        long total = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            total += diff[i];
            max = Math.max(max, diff[i]);
        }

        if (operations >= total) {
            return 0;
        }

        Arrays.sort(diff);

        long left = 0, right = max;
        while (left < right) {
            long mid = left + (right - left) / 2;
            long required = 0;

            for (long d : diff) {
                if (d > mid) {
                    required += d - mid;
                }
            }

            if (required <= operations) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        long threshold = left;
        long remaining = operations;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (diff[i] > threshold) {
                remaining -= diff[i] - threshold;
                diff[i] = threshold;
            }
        }

        for (int i = n - 1; i >= 0 && remaining > 0; i--) {
            if (diff[i] == threshold && threshold > 0) {
                diff[i]--;
                remaining--;
            }
        }

        for (long d : diff) {
            sum += d * d;
        }

        return sum;
    }
}