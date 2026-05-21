class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr1.length; i++) {
            while(arr1[i] > 0) {
                set.add(arr1[i]);
                arr1[i] /= 10;
            }
        }
        int max = 0;
        for(int i = 0; i < arr2.length; i++) {
            while(arr2[i] > 0) {
                if (set.contains(arr2[i])) {
                    max = Math.max(max, String.valueOf(arr2[i]).length());
                    break;
                }
                arr2[i] /= 10;
            }
        }
        return max;
    }
}
// public int longestCommonPrefix(int[] arr1, int[] arr2) {
    //     int max = Integer.MIN_VALUE;
    //     for(int i = 0; i < arr1.length; i++) {
    //         for(int j = 0; j < arr2.length; j++) {
    //             int a = commonPrefix(arr1[i], arr2[j]);
    //             max = Math.max(a, max);
    //         }
    //     }
    //     return max;
    // }
    // static int commonPrefix(int a, int b) {
    //     int count = 0;
    //     String as = Integer.toString(a);
    //     String bs = Integer.toString(b);
    //     int i = 0;
    //     while(as.length() > i && bs.length() > i) {
    //         if (as.charAt(i) == bs.charAt(i)) count++;
    //         else break;
    //         i++;
    //     }
    //     return count;
    // }