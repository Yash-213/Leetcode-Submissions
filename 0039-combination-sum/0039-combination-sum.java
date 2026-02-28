class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        combinations(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    static void combinations(int[] arr, int target, int idx, List<Integer> inner, List<List<Integer>> outer){
        if(target == 0) {
            outer.add(new ArrayList<>(inner));
            return;
        }
        if(target < 0) return;

        for(int i = idx; i < arr.length; i++){
            inner.add(arr[i]);
            combinations(arr, target - arr[i], i, inner, outer);
            inner.remove(inner.size() - 1);
        }
    }
}