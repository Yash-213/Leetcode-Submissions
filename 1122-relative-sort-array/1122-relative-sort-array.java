class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] arr = new int[n];
        int idx = 0;
        Arrays.sort(arr1);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < n; j++) {
                if (arr2[i] == arr1[j]) {
                    arr[idx++] = arr1[j];
                    arr1[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) 
            if (arr1[i] != -1) arr[idx++] = arr1[i];
            
        return arr;
    }
}