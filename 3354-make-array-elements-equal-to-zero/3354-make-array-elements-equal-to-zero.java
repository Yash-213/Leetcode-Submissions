class Solution {
    public int countValidSelections(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;

        int count = 0;
        int rem = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int diff = sum - rem;
                if (diff == rem)
                    count += 2;
                else if (Math.abs(diff - rem) == 1)
                    count++;
            }
            rem += nums[i];
        }
        
        return count;
    }
}