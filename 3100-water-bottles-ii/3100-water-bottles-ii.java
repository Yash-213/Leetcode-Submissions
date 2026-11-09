class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = 0;
        int exchange = 0;
        while (numBottles > 0) {
            ans += numBottles;
            exchange += numBottles;
            numBottles = 0;
            if (exchange >= numExchange) {
                numBottles++;
                exchange -= numExchange;
                numExchange++;
            }
        }
        return ans;
    }
}