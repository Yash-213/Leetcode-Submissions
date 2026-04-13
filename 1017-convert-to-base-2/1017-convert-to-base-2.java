class Solution {
    public String baseNeg2(int n) {
        if (n == 0) return "0";
        StringBuilder res = new StringBuilder();
        
        while (n != 0) {
            int rem = n % -2;
            n /= -2;
            
            // If the remainder is negative, we need to adjust it to make it a valid bit (0 or 1)
            if (rem < 0) {
                rem += 2; // Shift remainder from -1 to 1
                n += 1;   // Compensate by adding 1 to the quotient
            }
            res.append(rem);
        }
        
        // The bits are generated least-significant first, so we must reverse the string
        return res.reverse().toString();
    }
}