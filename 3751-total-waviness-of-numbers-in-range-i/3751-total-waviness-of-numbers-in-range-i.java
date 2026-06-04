class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for (int j = num1; j <= num2; j++) {
            String s = Integer.toString(j);
            for (int i = 1; i < s.length() - 1; i++) {
                boolean peak = s.charAt(i - 1) < s.charAt(i) &&
                        s.charAt(i) > s.charAt(i + 1);
                boolean valley = s.charAt(i - 1) > s.charAt(i) &&
                        s.charAt(i) < s.charAt(i + 1);
                if (peak || valley)
                    count++;
            }
        }
        return count;
    }
}