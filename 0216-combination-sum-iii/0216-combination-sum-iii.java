class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1, k, n, new ArrayList<>());
        return ans;
    }
    private void backtrack(int start, int k, int target,List<Integer> path) {
        if (target == 0 && path.size() == k) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if (target < 0 || path.size() > k) return;

        for (int i = start; i <= 9; i++) {
            if (i > target) break;
            path.add(i);
            backtrack(i + 1, k, target - i, path);
            path.remove(path.size() - 1);
        }
    }
}