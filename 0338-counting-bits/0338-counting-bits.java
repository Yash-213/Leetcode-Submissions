class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        int i = 1;
        while(i <= n){
            arr[i] = Integer.bitCount(i);
            i++;
        }
        return arr;
    }
}