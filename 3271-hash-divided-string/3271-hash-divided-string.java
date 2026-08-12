class Solution {
    public String stringHash(String s, int k) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i += k) {
            int sum = 0;
            for (int j = i; j < i + k; j++)
                sum += ch[j] - 'a';
            sb.append((char) ('a' + (sum % 26)));
        }
        return sb.toString();
    }
}