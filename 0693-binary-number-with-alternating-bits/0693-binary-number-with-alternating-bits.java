class Solution {
    public boolean hasAlternatingBits(int n) {
        String bit = Integer.toBinaryString(n);
        for(int i = 1; i < bit.length(); i++){
            if(bit.charAt(i) == bit.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}