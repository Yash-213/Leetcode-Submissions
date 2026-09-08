class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    arr[i] = nums[j];
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] < nums[j]) {
                        arr[i] = nums[j];
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) arr[i] = -1;
        }
        return arr;
    }
}