class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String str : sentences) {
            int count = str.length() - str.replace(" ", "").length();
            max = Math.max(count, max);
        }
        return max + 1;
    }
}