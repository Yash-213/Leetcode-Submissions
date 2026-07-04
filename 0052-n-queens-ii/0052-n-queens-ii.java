class Solution {
    static int count = 0;
    public int totalNQueens(int n) {
        int[][] arr = new int[n][n];
        count = 0;
        place(0, arr);
        return count;
    }

    private static void place(int row, int[][] arr) {
        if (row == arr.length) {
            count++;
            return;
        }
        for (int col = 0; col < arr.length; col++) {
            if (isSafe(row, col, arr)) {
                arr[row][col] = 1;
                place(row + 1, arr);
                arr[row][col] = 0;
            }
        }
    }

    private static boolean isSafe(int row, int col, int[][] arr) {
        int r = row;
        int c = col;

        //        Up
        while (r >= 0)
            if (arr[r--][c] == 1)
                return false;

        //        left diagonal
        r = row;
        while (r >= 0 && c >= 0)
            if (arr[r--][c--] == 1)
                return false;

        //        right diagonal
        r = row;
        c = col;
        while (r >= 0 && c < arr.length)
            if (arr[r--][c++] == 1)
                return false;

        return true;
    }
}