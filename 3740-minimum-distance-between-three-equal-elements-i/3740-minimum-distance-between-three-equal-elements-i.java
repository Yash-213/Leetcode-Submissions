class Solution {
    public int minimumDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] == nums[k]) {
                            flag = true;
                            min = Math.min(min, (j - i) + (k - j) + (k - i));
                            break;
                        }
                    }
                }
            }
        }
        if (flag)
            return min;
        return -1;
    }
}