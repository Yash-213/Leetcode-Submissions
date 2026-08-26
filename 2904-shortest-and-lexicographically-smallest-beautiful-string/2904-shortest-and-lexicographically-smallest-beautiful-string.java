class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int min = 101;
        int l = 0, r = l;
        int count = 0;
        char[] ch = s.toCharArray();
        String str = "";
        while (r < ch.length) {
            if (ch[r] == '1')
                count++;

            while (count > k || (l <= r && ch[l] == '0')) {
                if (ch[l] == '1')
                    count--;
                l++;
            }

            if (count == k && r - l + 1 <= min) {
                String a = s.substring(l, r + 1);
                if (r - l + 1 < min) {
                    min = Math.min(min, r - l + 1);
                    str = a;
                } else if (a.compareTo(str) < 0)
                    str = a;
            }
            r++;
        }
        return str;
    }
}