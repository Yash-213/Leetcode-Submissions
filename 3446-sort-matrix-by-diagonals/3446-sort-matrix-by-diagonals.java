class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++)
            sort(grid, i, 0, true);

        for (int i = 1; i < m; i++)
            sort(grid, 0, i, false);

        return grid;
    }

    void sort(int[][] grid, int i, int j, boolean flag) {
        int n = grid.length;
        int m = grid[0].length;

        int r = i;
        int c = j;

        List<Integer> list = new ArrayList<>();
        while (r < n && c < m)
            list.add(grid[r++][c++]);

        if (flag)
            list.sort(Collections.reverseOrder());
        else
            Collections.sort(list);

        r = i;
        c = j;

        int idx = 0;
        while (idx < list.size())
            grid[r++][c++] = list.get(idx++);
    }
}