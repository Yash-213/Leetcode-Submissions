class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        int ans = -1;
        for (int pile : piles) r = Math.max(pile, r);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int hrs = countHours(piles, mid);
            if (hrs <= h) {
                ans = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return ans;
    }
    private static int countHours (int[] piles, int k) {
        int h = 0;
        for (int pile : piles) h += Math.ceil((double) pile / k);
        return h;
    }
}