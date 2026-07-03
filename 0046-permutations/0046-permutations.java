class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        find (new ArrayList<>(), nums, l);
        return l;
    }
    private static void find(List<Integer> ans, int[] arr, List<List<Integer>> l) {
        if (ans.size() == arr.length) {
            l.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (ans.contains(arr[i]) == false) {
                ans.add(arr[i]);
                find(ans , arr, l);
                ans.remove(ans.size() - 1);
            }
        }
    }
}