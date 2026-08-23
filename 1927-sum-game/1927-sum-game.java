class Solution {
    public boolean sumGame(String num) {
        int sum1 = 0, sum2 = 0;
        int count1 = 0, count2 = 0;
        int mid = num.length() / 2;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            if (c == '?') {
                if (i < mid)  count1++;
                else  count2++;
            } else {
                if (i < mid) sum1 += c - '0';
                else sum2 += c - '0';
            }
        }

        if ((count1 + count2) % 2 == 1) return true;

        return 2 * (sum1 - sum2) != 9 * (count2 - count1);
    }
}
