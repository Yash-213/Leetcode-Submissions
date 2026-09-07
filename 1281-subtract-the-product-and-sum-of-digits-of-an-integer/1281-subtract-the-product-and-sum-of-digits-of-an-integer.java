class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int multi = 1;

        while (n > 0) {
            sum += (n % 10);
            multi *= (n % 10);
            n /= 10;
        }
        return multi - sum;
    }
}