class Solution {
    public int numberOfSpecialChars(String word) {
        int[] last = new int[26];
        int[] first = new int[26];
        Arrays.fill(last, -1);
        Arrays.fill(first, -1);
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) 
                last[c - 'a'] = i;
            else {
                if (first[c - 'A'] == -1) 
                    first[c - 'A'] = i;
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (last[i]!=-1 && first[i]!=-1 && last[i] < first[i])
                count++;
        }
        return count;
    }
}