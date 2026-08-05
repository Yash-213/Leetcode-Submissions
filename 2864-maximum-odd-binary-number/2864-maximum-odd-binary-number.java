class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count0 = 0;
        int count1 = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') count0++;
            else count1++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1");
        count1--;

        sb.append("0".repeat(count0));
        sb.append("1".repeat(count1));

        return sb.reverse().toString();
    }
}