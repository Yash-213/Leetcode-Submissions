class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0 , n = 0, count = 0;
        for(char c : text.toCharArray()) {
            if (c == 'a') a++;
            else if (c == 'b') b++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
        }
        o /= 2;
        l /= 2;
        return Math.min(Math.min(a, b), Math.min(Math.min(l, o), n));
    }
}