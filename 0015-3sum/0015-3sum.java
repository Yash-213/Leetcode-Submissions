class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (set.contains(nums[i]))
                continue;
            set.add(nums[i]);
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                } else if (sum > 0)
                    r--;
                else
                    l++;
            }
        }
        return list;
    }
}
