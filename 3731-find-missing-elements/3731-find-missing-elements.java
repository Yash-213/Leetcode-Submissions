class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = min; i <= max; i++) set.add(i);
        for (int n : nums) set.remove(n);
        return new ArrayList<>(set);
    }
}