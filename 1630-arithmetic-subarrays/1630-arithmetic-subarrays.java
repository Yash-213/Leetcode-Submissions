class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> boolList = new ArrayList<>();
        for (int i = 0; i < l.length; i++) 
            boolList.add(isArithmeticSeq(nums, l[i], r[i]));

        return boolList;
    }

    private static boolean isArithmeticSeq(int[] arr, int l, int r) {
        int n = r - l + 1;
        if (n <= 2) return true;

        int[] nums = Arrays.copyOfRange(arr, l, r + 1);
        Arrays.sort(nums);

        int diff = nums[1] - nums[0];

        for (int i = 2; i < nums.length; i++) 
            if (nums[i] - nums[i - 1] != diff) 
                return false;

        return true;
    }

}