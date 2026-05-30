class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int fr = 0, lr = n - 1;
        int fc = 0, lc = n - 1;
        int a = 0;
        while (a < n * n) {
            for(int i = fc; i <= lc; i++) arr[fr][i] = ++a;
            fr++;
            for(int i = fr; i <= lr; i++) arr[i][lr] = ++a;
            lc--;
            for(int i = lc; i >= fc; i--) arr[lr][i] = ++a;
            lr--;
            for(int i = lr; i >= fr; i--) arr[i][fc] = ++a;
            fc++;
        }
        return arr;
    }
}