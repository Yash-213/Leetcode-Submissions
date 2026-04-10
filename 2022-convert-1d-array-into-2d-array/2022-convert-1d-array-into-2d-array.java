class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(n * m != original.length) return new int[][]{};
        int[][] arr = new int[m][n];
        int a = 0;
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) arr[i][j] = original[a++];
        return arr;
    }
}