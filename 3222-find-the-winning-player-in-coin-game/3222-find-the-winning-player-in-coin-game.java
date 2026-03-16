class Solution {
    public String winningPlayer(int x, int y) {
        int a = 0;
        while(true) {
            if(x == 0 || y < 4) {
                if((a & 1) == 0) return "Bob";
                return "Alice";
            }
            x -= 1;
            y -= 4;
            a++;
        }
    }
}