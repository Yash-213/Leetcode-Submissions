class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] countArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            countArr[i] = arr[i];
        }
        Arrays.sort(countArr, (a, b) -> {
            int diff = Integer.bitCount(a) - Integer.bitCount(b);
            if (diff == 0) {
                return a - b;
            }
            return diff;
        });
        for(int i = 0; i < arr.length; i++){
            arr[i] = countArr[i];
        }
        return arr;
    }
}