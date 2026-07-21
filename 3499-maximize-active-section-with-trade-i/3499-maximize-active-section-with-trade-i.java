class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '1')
                ans++;

        int max = 0, count = 0, count1 = 0, i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == '0') {
                count++;
                i++;
            }
            while (i < s.length() && s.charAt(i) == '1') 
                i++;
            while (i < s.length() && s.charAt(i) == '0') {
                count1++;
                i++;
            }
            if (count != 0 && count1 != 0)
                max = Math.max(max, count + count1);

            count = count1;
            count1 = 0;
        }
        ans += max;
        return ans;
    }
}