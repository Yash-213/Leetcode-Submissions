class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        String sum = "";

        while (i >= 0 && j >= 0) {
            int d1 = num1.charAt(i) - '0';
            int d2 = num2.charAt(j) - '0';

            int id = (d1 + d2 + carry) % 10;
            sum = id + sum;
            carry = (d1 + d2 + carry) / 10;
            i--;
            j--;
        }

        while (i >= 0) {
            int d1 = num1.charAt(i) - '0';
            int id = (d1 + carry) % 10;
            sum = id + sum;
            carry = (d1 + carry) / 10;
            i--;
        }

        while (j >= 0) {
            int d2 = num2.charAt(j) - '0';
            int id = (d2 + carry) % 10;
            sum = id + sum;
            carry = (d2 + carry) / 10;
            j--;
        }
        if (carry > 0) sum = carry + sum;

        return sum;
    }
}