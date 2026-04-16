class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : queries) {
            ArrayList<Integer> arr = map.get(nums[i]);
            if (arr.size() == 1) {
                list.add(-1);
                continue;
            }
            int idx = Collections.binarySearch(arr, i);
            int left = arr.get((idx - 1 + arr.size()) % arr.size());
            int right = arr.get((idx + 1) % arr.size());

            int d1 = Math.abs(i - left);
            int d2 = Math.abs(i - right);

            int minDist = Math.min(
                    Math.min(d1, n - d1),
                    Math.min(d2, n - d2));

            list.add(minDist);

        }
        return list;
    }
}