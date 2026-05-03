class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int a = piles.length / 3;
        for (int i = piles.length - 2; a > 0; i -= 2) {
            sum += piles[i];
            a--;
        }
        return sum;
    }
}