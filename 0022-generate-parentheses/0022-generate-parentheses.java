class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, "", 0, 0, n);
        return ans;
    }
    static void generate(List<String> list, String p, int open, int close, int n) {
        if(p.length() == 2 * n){
            list.add(p);
            return;
        }
        if(open < n) generate(list, p + "(", open + 1, close, n);
        if(close < open) generate(list, p + ")", open, close + 1, n);
    }
}