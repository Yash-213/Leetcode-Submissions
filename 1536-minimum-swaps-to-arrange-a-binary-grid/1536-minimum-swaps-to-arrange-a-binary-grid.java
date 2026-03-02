class Solution {
    public int minSwaps(int[][] grid) {
        int[] arrZero = new int[grid.length];

        for(int i = 0; i < grid.length; i++) {
            int count = 0;
            for(int j = grid[0].length - 1; j > 0; j--) {
                if(grid[i][j] == 0) {
                    count++;
                }else{
                    break;
                }
            }
            arrZero[i] = count;
        }
        int swap = 0;
        for(int i = 0; i < arrZero.length; i++) {
            int req = arrZero.length - 1 - i;
            int j = i;
            while(j < arrZero.length && arrZero[j] < req) {
                j++;
            }
            if(j == arrZero.length) return -1;
            
            while(j > i){
                int temp = arrZero[j];
                arrZero[j] = arrZero[j - 1];
                arrZero[j - 1] = temp;
                swap++;
                j--;
            }
        }
        return swap;
    }
}