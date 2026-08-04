class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
            list.add(i);
        }
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (nums[j] == list.get(i)) {
                list.remove(i);
                j++;
                i--;
            }
        }
        return list;
    }
}