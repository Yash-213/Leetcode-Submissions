class Solution {
    public int countGoodSubstrings(String s) {
        int[] freq = new int[26];
        
        int l = 0, r = l;
        int count = 0;

        char[] ch = s.toCharArray();

        while (r < ch.length) {
            while (l <= r && r - l + 1 > 3) {
                freq[ch[l] - 'a']--;
                l++;
            }

            freq[ch[r] - 'a']++;

            if (r - l + 1 == 3 
                    && freq[ch[l] - 'a'] == 1 
                    && freq[ch[r] - 'a'] == 1)
                count++;

            r++;
        }

        return count;
    }
}