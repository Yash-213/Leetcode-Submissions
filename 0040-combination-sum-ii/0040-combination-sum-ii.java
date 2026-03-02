class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combinations(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    static void combinations(int[] arr, int target, int idx, List<Integer> inner, List<List<Integer>> outer){
        if(target == 0) {
            outer.add(new ArrayList<>(inner));
            return;
        }

        for(int i = idx; i < arr.length; i++){
            if(i > idx && arr[i] == arr[i - 1]) continue;
            if(arr[i] > target) break;
            inner.add(arr[i]);
            combinations(arr, target - arr[i], i + 1, inner, outer);
            inner.remove(inner.size() - 1);
        }
    }
}