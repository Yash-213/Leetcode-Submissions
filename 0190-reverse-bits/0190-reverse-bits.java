class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++){
            //if result leftshift is 1 or n is 1 then result store 0 
            result = (result << 1) | (n & 1);
            //this is unsigned shift to right
            n >>>= 1;
        }
        return result;
    }
}