class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String> ans = new ArrayList<>();
        str(n, "", ans, false);
        return ans;
    }
    static void str(int n, String p, ArrayList<String> ans, boolean flag) {
        if (n == p.length()) {
            if (n <= 2 || flag)
                ans.add(p);
            return;
        }
        str(n, p + "1", ans, true);

        if (p.length() == 0 || p.charAt(p.length() - 1) != '0') {
            str(n, p + "0", ans, flag);
        }
    }
}