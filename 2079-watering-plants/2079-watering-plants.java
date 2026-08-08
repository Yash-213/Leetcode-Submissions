class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int a = capacity;
        int count = 0;
        for (int i = 0; i < plants.length; i++) {
            if (a < plants[i]) {
                count += (2 * i);
                a = capacity;
            }
            a -= plants[i];
            count++;
        }
        return count;
    }
}