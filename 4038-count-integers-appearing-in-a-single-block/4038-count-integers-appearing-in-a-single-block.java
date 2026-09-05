class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> check = new HashSet<>();

        int count = 0;
        int i = 0;

        while (i < nums.length) {
            int j = i + 1;
            while (j < nums.length && nums[j] == nums[i]) j++;

            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                count++;
            } else if (!check.contains(nums[i])) {
                check.add(nums[i]);
                count--;
            }

            i = j;
        }

        return count;
    }
}
