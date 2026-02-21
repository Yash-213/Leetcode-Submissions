class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        while (left <= right) {
            int bits = Integer.bitCount(left);
            if (bits < 2) {
                left++;
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i * i <= bits; i++) {
                if (bits % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                count++;
            left++;
        }
        return count;
    }
}