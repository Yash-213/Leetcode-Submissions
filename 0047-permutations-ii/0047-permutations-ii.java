class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        return permutations(nums, 0);
    }

    static List<List<Integer>> permutations(int[] arr, int idx) {
        if (idx == arr.length) {
            List<List<Integer>> outer = new ArrayList<>();
            List<Integer> internal = new ArrayList<>();
            for (int num : arr) {
                internal.add(num);
            }
            outer.add(internal);
            return outer;
        }

        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(); // track duplicates at this level

        for (int i = idx; i < arr.length; i++) {

            // skip if already used at this level
            if (set.contains(arr[i])) continue;

            set.add(arr[i]);

            swap(arr, idx, i);
            list.addAll(permutations(arr, idx + 1));
            swap(arr, idx, i);
        }
        return list;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
