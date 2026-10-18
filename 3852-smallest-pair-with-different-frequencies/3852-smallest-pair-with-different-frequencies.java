class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        if (nums.length < 3)
            return new int[] { -1, -1 };
            
        Arrays.sort(nums);

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int smallest = nums[0];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int a = entry.getKey();
            int b = entry.getValue();

            if (a != smallest && map.get(smallest) != b && smallest < a)
                return new int[] { smallest, a };
        }
        return new int[] { -1, -1 };
    }
}