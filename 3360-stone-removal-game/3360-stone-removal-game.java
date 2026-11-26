class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        boolean aliceWin = true;
        while (n >= remove) {
            n -= remove;
            remove--;
            aliceWin = !aliceWin;
        }
        return !aliceWin;
    }
}