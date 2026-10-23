class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int ans = 0;
        for (int num : nums) {
            ans = (ans * 2 + num) % 5;
            list.add(ans == 0);
        }
        return list;
    }
}