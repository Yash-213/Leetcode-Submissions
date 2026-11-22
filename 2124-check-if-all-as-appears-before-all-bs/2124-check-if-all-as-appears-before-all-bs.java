class Solution {
    public boolean checkString(String s) {
        boolean bAppear = false;
        for (char c : s.toCharArray()) {
            if (c == 'b') bAppear = true;
            if (bAppear && c == 'a') return false;
        }
        return true;
    }
}