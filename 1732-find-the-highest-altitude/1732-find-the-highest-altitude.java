class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length + 1];
        int sum = 0;
        int max = 0;
        for(int g : gain){
            sum += g;
            max = Math.max(max, sum);
        }
        return max;
    }
}