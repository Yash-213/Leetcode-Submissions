class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        int[] arr = new int[2];
        int i = 0;
        for (int num : nums) if (map.get(num) == 1) arr[i++] = num;
        
        return arr;
    }
}