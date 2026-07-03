class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        find(s, new ArrayList<>(), list);
        return list;
    }

    private static void find(String s, List<String> list, List<List<String>> outer) {
        if (s.length() == 0) {
            outer.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (palindrome(s.substring(0, i + 1))) {
                list.add(s.substring(0, i + 1));
                find(s.substring(i + 1), list, outer);
                list.remove(list.size() - 1);
            }
        }
    }

    private static boolean palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}