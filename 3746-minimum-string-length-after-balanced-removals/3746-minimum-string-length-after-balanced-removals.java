class Solution {
    public int minLengthAfterRemovals(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) 
            count += s.charAt(i) == 'a' ? 1 : -1;

        return Math.abs(count);
    }
}