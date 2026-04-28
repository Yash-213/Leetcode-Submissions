class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length, idx = 0;
        int[] arr = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[idx++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int move = 0;
        int mid = arr[arr.length / 2];
        for (int a : arr) {
            int diff = Math.abs(a - mid);
            if (diff % x != 0) {
                return -1;
            }

            move += diff / x;
        }
        return move;
    }
}