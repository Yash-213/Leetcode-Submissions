class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        int n = s1.length();
        int l = 0;
        int r = 0;
        List<List<String>> list = new ArrayList<>();
        while (l < n) {
            if (s1.charAt(l) == s2.charAt(r)) {
                l++;
                r++;
            } else {
                List<String> inner = new ArrayList<>();
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                while (l < n && s1.charAt(l) != s2.charAt(r)) {
                    sb1.append(s1.charAt(l++));
                    sb2.append(s2.charAt(r++));
                }
                inner.add(sb1.toString());
                inner.add(sb2.toString());
                list.add(inner);
            }
        }
        return list;
    }
}