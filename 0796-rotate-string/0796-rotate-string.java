class Solution {
    public boolean rotateString(String s, String goal) {
        String str = s + s;
        return s.length() == goal.length() && str.contains(goal);
    }
}