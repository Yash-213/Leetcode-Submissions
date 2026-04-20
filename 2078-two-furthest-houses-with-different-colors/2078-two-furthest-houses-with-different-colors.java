class Solution {
    public int maxDistance(int[] colors) {
        int dist = 0;
        for(int i = 0; i < colors.length; i++) {
            if (colors[i] != colors[0]) {
                dist = i;
            }
        }
        return dist;
    }
}