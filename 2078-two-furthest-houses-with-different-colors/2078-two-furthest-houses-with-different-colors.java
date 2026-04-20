class Solution {
    public int maxDistance(int[] colors) {
        int dist = 0;
        for(int i = 0; i < colors.length; i++) {
            if (colors[i] != colors[0]) {
                dist = i;
            }
        }
        for(int i = 0; i < colors.length; i++) {
            if(colors[i] != colors[colors.length - 1]) {
                dist = Math.max(dist, colors.length - i - 1);
            }
        }
        return dist;
    }
}