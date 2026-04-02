class Solution {
    int m;
    int n;
    int[][][] t;

    int solve(int[][] coins, int i, int j, int neu) {

        if (i == m - 1 && j == n - 1) {
            if (coins[i][j] < 0 && neu > 0) {
                return 0;
            }
            return coins[i][j];
        }

        if (i >= m || j >= n) {
            return -1000000000; 
        }

        if (t[i][j][neu] != -1000000000) {
            return t[i][j][neu];
        }

        int down = solve(coins, i + 1, j, neu);
        int right = solve(coins, i, j + 1, neu);

        int take = -1000000000;

        if (down != -1000000000 || right != -1000000000) {
            take = coins[i][j] + Math.max(down, right);
        }

        int skip = -1000000000;

        if (coins[i][j] < 0 && neu > 0) {
            int skipDown = solve(coins, i + 1, j, neu - 1);
            int skipRight = solve(coins, i, j + 1, neu - 1);
            skip = Math.max(skipRight, skipDown);
        }

        return t[i][j][neu] = Math.max(take, skip);
    }

    public int maximumAmount(int[][] coins) {
        m = coins.length;
        n = coins[0].length;

        
        t = new int[m][n][3];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    t[i][j][k] = -1000000000;
                }
            }
        }

        return solve(coins, 0, 0, 2);
    }
}