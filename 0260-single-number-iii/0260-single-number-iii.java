class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        int[] arr = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> n : map.entrySet()) 
            if (n.getValue() == 1) arr[i++] = n.getKey();

        return arr;
    }
}