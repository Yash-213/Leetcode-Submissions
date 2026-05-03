class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int a = piles.length / 3;
        for(int i = piles.length - 2; i > 0; i -= 2) {
            if (a > 0){
                sum += piles[i];
                a--;
            }else break;
        }
        return sum;
    }
}