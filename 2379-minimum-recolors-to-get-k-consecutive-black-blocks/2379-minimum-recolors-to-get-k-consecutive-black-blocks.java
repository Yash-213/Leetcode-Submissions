class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        char[] arr = blocks.toCharArray();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int count = 0;
            for (int j = i; j < k + i; j++) {
                if (arr[j] == 'W')count++;
            }
            min = Math.min(min, count);
        }
        return min;
    }
}