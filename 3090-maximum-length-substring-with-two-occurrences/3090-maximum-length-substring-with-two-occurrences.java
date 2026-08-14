class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                if (freq[s.charAt(j) - 'a'] > 2) {
                    freq[s.charAt(j) - 'a']--;
                    break;
                }
                max = Math.max(max, j - i + 1);
            }
            freq = new int[26];
        }
        return max;
    }
}