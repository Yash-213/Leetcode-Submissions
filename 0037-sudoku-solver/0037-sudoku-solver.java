class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') {

                    for (char num = '1'; num <= '9'; num++) {

                        if (isSafe(board, r, c, num)) {

                            board[r][c] = num;

                            if (solve(board)) {
                                return true;
                            }

                            board[r][c] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isSafe(char[][] board, int r, int c, char num) {

        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][c] == num) {
                return false;
            }
        }

        // Check 3x3 subgrid
        int rowStart = (r / 3) * 3;
        int colStart = (c / 3) * 3;

        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}