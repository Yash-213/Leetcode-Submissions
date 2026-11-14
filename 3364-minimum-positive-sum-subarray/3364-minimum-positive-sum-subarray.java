class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minPositive = Integer.MAX_VALUE;
        while (l <= r) {
            int sum = 0;
            for (int i = 0; i < l; i++) {
                sum += nums.get(i);
            }
            if (sum > 0) minPositive = Math.min(minPositive, sum);
            for (int i = l; i < nums.size(); i++) {
                sum += nums.get(i);
                sum -= nums.get(i - l);
                if (sum > 0) minPositive = Math.min(minPositive, sum);
            }
            l++;
        }
        return minPositive == Integer.MAX_VALUE ? -1 : minPositive;
    }
}