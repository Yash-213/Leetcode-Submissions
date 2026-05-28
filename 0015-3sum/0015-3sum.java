class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int a = nums[i] * (-1);
            int l = i + 1, r = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (r > l) {
                int sum = nums[l] + nums[r];
                if (sum == a) {
                    ArrayList<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[l]);
                    inner.add(nums[r]);
                    list.add(inner);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                } 
                else if (sum > a) r--;
                else l++;
            }
        }
        return list;
    }
}