class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> str = new ArrayList<>();
        creation(n, "", str);
        if (k > str.size())
            return "";
        return str.get(k - 1);
    }

    static void creation(int n, String s, ArrayList<String> str) {
        if (n == 0) {
            str.add(s);
            return;
        }
        if (s.length() == 0 || s.charAt(s.length() - 1) != 'a')
            creation(n - 1, s + "a", str);
        if (s.length() == 0 || s.charAt(s.length() - 1) != 'b')
            creation(n - 1, s + "b", str);
        if (s.length() == 0 || s.charAt(s.length() - 1) != 'c')
            creation(n - 1, s + "c", str);
    }
}