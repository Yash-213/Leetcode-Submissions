class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int land = Integer.MAX_VALUE;
        int  req= Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            land = Math.min(land, landStartTime[i] + landDuration[i]);

        for (int i = 0; i < m; i++) 
            req = Math.min(req, Math.max(land, waterStartTime[i]) + waterDuration[i]);

        int water = Integer.MAX_VALUE;
        int req1 = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) 
            water = Math.min(water, waterStartTime[i] + waterDuration[i]);

        for (int i = 0; i < n; i++) 
            req1 = Math.min(req1, Math.max(water, landStartTime[i]) + landDuration[i]);

        return Math.min(req, req1);
    }
}