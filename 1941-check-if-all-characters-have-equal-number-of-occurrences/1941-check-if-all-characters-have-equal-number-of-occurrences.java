class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        int a = 0;
        for (int i : freq) {
            if (i == 0) continue;
            if (a == 0) a = i; 
            if (i != a) return false;
        }
        return true;
    }
}