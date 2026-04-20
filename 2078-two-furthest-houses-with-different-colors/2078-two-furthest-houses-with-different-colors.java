class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int dist = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (colors[i] != colors[0]) {
                dist = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                dist = Math.max(dist, n - i - 1);
                break;
            }
        }
        return dist;
    }
}