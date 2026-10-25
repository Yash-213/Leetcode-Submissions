class Solution {
    public int closedIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if ((i == 0
                        || j == 0
                        || i == r - 1
                        || j == c - 1)
                        && grid[i][j] == 0)
                    island(grid, i, j);

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (grid[i][j] == 0) {
                    count++;
                    island(grid, i, j);
                }

        return count;
    }

    private static void island(int[][] grid, int r, int c) {
        if (r >= grid.length
                || c >= grid[0].length
                || r < 0 || c < 0
                || grid[r][c] == 1)
            return;

        grid[r][c] = 1;
        island(grid, r - 1, c);
        island(grid, r, c - 1);
        island(grid, r + 1, c);
        island(grid, r, c + 1);
    }
}