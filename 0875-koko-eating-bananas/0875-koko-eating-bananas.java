class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        int ans = -1;
        for (int pile : piles) right = Math.max(right, pile);

        while (left <= right) {
            int mid = (left + right) / 2;
            int hrs = canEatAll(piles, mid);
            if (hrs <= h) {
                ans = mid;
                right = mid - 1;
            } else 
                left = mid + 1;
        }
        return ans;
    }

    private int canEatAll(int[] piles, int k) {
        int hours = 0;

        for (int pile : piles) hours += Math.ceil((double) pile / k);
        return hours;
    }
}
