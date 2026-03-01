class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        combinations(n, k, new ArrayList<>(), ans, 1);

        return ans;
    }
    static void combinations(int n, int k, List<Integer> inner, List<List<Integer>> outer, int idx){
        if(inner.size() == k){
            outer.add(new ArrayList<>(inner));
            return;
        }
        for(int i = idx; i <= n; i++){
            inner.add(i);
            combinations(n, k, inner, outer, i + 1);
            inner.remove(inner.size() - 1);
        }
    }
}