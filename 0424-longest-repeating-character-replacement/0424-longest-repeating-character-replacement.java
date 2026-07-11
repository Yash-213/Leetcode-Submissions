class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int max = 0;
        int l = 0;
        int maxFreq = 0;

        for (int r = 0; r < s.length(); r++) {
            freq[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);
            if (r - l + 1 - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}