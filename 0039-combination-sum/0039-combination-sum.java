class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        comSum(new ArrayList<>(), candidates, 0, target, list);
        return list;
    }

    private static void comSum(List<Integer> ans, int[] arr, int idx, int t, List<List<Integer>> list) {
        if (t == 0) {
            list.add(new ArrayList<>(ans));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] <= t) {
                ans.add(arr[i]);
                comSum(ans, arr, i, t - arr[i], list);
                ans.remove(ans.size() - 1);
            }
        }
    }
}