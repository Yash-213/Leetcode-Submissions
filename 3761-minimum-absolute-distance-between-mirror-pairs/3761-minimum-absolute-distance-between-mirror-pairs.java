class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) 
                ans = Math.min(ans, i - map.get(nums[i]));
            map.put(reverse(nums[i]), i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    static int reverse(int n) {
        int a = 0;
        while (n > 0) {
            a = a * 10 + n % 10;
            n /= 10;
        }
        return a;
    }
}