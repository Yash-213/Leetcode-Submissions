class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int a = 0;
        boolean flag = false;
        for (int i : freq) {
            if (i != 0 && !flag) {
                a = i;
                flag = true;
            } 
            if (i != 0 && a != i) return false;
        }
        return true;
    }
}