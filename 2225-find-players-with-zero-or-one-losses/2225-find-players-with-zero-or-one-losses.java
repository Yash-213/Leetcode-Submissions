class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int[] m : matches) {
            map.putIfAbsent(m[0], 0);
            map.put(m[1], map.getOrDefault(m[1], 0) + 1);
        }

        List<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        for (int k : map.keySet()) {
            if (map.get(k) == 0) a.add(k);
            else if (map.get(k) == 1) b.add(k);
        }

        Collections.sort(a);
        Collections.sort(b);
        return Arrays.asList(a, b);
    }
}