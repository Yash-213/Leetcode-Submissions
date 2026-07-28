class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        char mid = 0;

        for (int i = 0; i < 26; i++) {
            int n = freq[i] / 2;
            while (n-- > 0) {
                sb.append((char) ('a' + i));
            }

            if (freq[i] % 2 == 1) {
                mid = (char) ('a' + i);
            }
        }

        String rev = new StringBuilder(sb).reverse().toString();

        if (mid != 0) {
            sb.append(mid);
        }

        sb.append(rev);
        return sb.toString();
    }
}