class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int zero = 0;
        int dist = 0;
        while (right < nums.length) {
            if (nums[right] == 0) zero++;
            right++;
            while (zero > k) {
                if (nums[left] == 0) zero--;
                left++;
            }
            dist = Math.max(dist, right - left);
        }
        return dist;
    }
}