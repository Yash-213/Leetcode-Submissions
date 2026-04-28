class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length;
        int[] arr = new int[m * n];
        int idx = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[idx++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int mid = arr[arr.length / 2], move = 0;
        for(int a : arr) {
            move += Math.abs(mid - a);
        }
        return move;
    }
}