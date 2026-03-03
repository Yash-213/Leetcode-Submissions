class Solution {
    public char findKthBit(int n, int k) {
        String s = bits(n);
        
        return s.charAt(k - 1);
    }
    static String bits(int n) {
        if(n == 1) {
            return "0";
        }
        String s = bits(n - 1);
        String str = reverse(invert(s));
        return s + "1" + str;
    }
    static String invert(String s) {
        StringBuilder inverted = new StringBuilder();
        for (char c : s.toCharArray()) {
            inverted.append(c == '0' ? '1' : '0');
        }
        return inverted.toString();
    }

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}