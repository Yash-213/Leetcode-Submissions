class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean flag = num < 0;
        if (flag) num *= -1;
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (flag) sb.append('-');
        return sb.reverse().toString();
    }
}