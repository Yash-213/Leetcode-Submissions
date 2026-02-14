class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return permutationsNumbList(nums, 0);
    }
    static List<List<Integer>> permutationsNumbList(int[] arr, int idx){
        if (idx == arr.length){
            List<List<Integer>> outer = new ArrayList<>();
            List<Integer> internal = new ArrayList<>();
            for (int num : arr) {
                internal.add(num);
            }
            outer.add(internal);
            return outer;
        }
        List<List<Integer>> list = new ArrayList<>();

        for (int i = idx; i < arr.length; i++) {
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
            list.addAll(permutationsNumbList(arr, idx + 1));
            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        return list;
    }
}