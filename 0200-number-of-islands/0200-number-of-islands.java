class Solution {
    public int numIslands(char[][] grid) {
       int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    makeZero(i, j, grid);
                }
            }
        }
        return count;
    }

    private static void makeZero(int r, int c, char[][] grid) {
        if (r >= grid.length || c >= grid[0].length || r < 0 || c < 0 || grid[r][c] == '0') return;

        grid[r][c] = '0';
//        Up
        makeZero(r - 1, c, grid);
//        Down
        makeZero(r + 1, c, grid);
//        left
        makeZero(r, c - 1, grid);
//        rigth
        makeZero(r, c + 1, grid);
    }
}