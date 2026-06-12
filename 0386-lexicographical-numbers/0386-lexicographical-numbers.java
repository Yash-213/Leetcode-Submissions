class Solution {
    static public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) list.add(i);

        list.sort((a, b) -> {
            String s1 = String.valueOf(a);
            String s2 = String.valueOf(b);
            return s1.compareTo(s2);
        });
        return list;
    }
}