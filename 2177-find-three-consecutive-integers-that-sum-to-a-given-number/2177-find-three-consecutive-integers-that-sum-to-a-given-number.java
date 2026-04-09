class Solution {
    public long[] sumOfThree(long num) {
        long a = num / 3;
        long add = a - 1 + a + a + 1;
        if(add == num) {
            return new long[] {a - 1, a , a + 1};
        }
        return new long[]{};
    }
}