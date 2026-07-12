class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < arrCopy.length; i++) {
            if (!map.containsKey(arrCopy[i])) {
                map.put(arrCopy[i], rank);
                rank++;
            }
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            newArr[i] = map.get(arr[i]);
        return newArr;
    }
}