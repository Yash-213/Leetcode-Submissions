class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for(List<Integer> idx : map.values()) {
            if(idx.size() < 3) continue;

            for(int i = 0; i + 2 < idx.size(); i++) {
                min = Math.min(min, 2 * (idx.get(i + 2) - idx.get(i)));
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;   
    }
}