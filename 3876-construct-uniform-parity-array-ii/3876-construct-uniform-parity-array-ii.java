class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        Arrays.sort(nums1);
        for (int a = 0; a <= 1; a++) {
            boolean c = true;
            for (int i = 0; i < n; i++) {
                boolean d = false;
                if (nums1[i] % 2 == a) d = true;
                if (!d) {
                    for (int j = 0; j < n; j++) {
                        if (i == j) continue;
                        int diff = nums1[i] - nums1[j];
                        if (diff >= 1 && diff % 2 == a) {
                            d = true;
                            break;
                        }
                    }
                }
                if (!d) {
                    c = false;
                    break;
                }
            }
            if (c) return true;
        }
        return false;
    }
}