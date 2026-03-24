class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1;
        int c = 0, a = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                p *= nums[i];
            } else {
                c++;
                a = i;
            } 
            if (c > 1) {
                return arr;
            }
        }
        if(c == 1) {
            arr[a] = p;
            return arr;
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i] = p / nums[i];
        }
        return arr;
    }
}