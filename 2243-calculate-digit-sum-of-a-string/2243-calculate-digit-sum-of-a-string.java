class Solution {
    public String digitSum(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        while (str.length() > k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i += k) {
                int sum = 0;
                for (int j = i; j < Math.min(i + k, str.length()); j++)
                    sum += str.charAt(j) - '0';
                sb.append(sum);
            }
            str = sb;
        }
        return str.toString();
    }
}