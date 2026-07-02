class Solution {
    static String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        comb(0, list, digits, "");
        return list;
    }

    private static void 
    comb(int i, ArrayList<String> list, String digits, String up) {
        if (i == digits.length()) {
            list.add(up);
            return;
        }
        int idx = digits.charAt(i) - '0';

        String s = arr[idx];

        for (int t = 0; t < s.length(); t++) {
            comb(i + 1, list, digits, up + s.charAt(t));
        }
    }
}