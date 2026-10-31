class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = 0;
        int n = timeSeries.length;
        for (int i = 0; i < n; i++)
            time += 
                    i == n - 1 ? 
                    duration : 
                    Math.min(duration, timeSeries[i + 1] - timeSeries[i]);

        return time;
    }
}