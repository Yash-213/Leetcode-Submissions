class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++)
            map.put(i, 0);

        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];
            map.put(a, map.get(a) - 1);
            map.put(b, map.get(b) + 1);
        }
        for (int i = 1; i <= n; i++)
            if (map.get(i) == n - 1)
                return i;
        return -1;
    }
}