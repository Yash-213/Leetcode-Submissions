class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int sum = 1;
        int i = 2;
        while (num >= i * i) {
            if (sum > num) return false;
            if (num % i == 0) {
                sum += i;
                if (num / i != i)
                    sum += (num / i);
            }
            i++;
        }
        return sum == num;
    }
}