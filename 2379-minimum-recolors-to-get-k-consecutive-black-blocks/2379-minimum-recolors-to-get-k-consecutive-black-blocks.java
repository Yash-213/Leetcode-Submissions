class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int min = 0;
        for (int i = 0; i < k; i++)
            if (blocks.charAt(i) == 'W')
                min++;

        int count = min;
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i - k) == 'W')
                count--;
            if (blocks.charAt(i) == 'W')
                count++;
            min = Math.min(min, count);
        }
        return min;
    }
}