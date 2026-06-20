class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> str = new ArrayList<>();
        Set<Double> set  = new HashSet<>();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                double a = (double) i / j;
                if (a < 1 && !set.contains(a)) {
                    String s = i + "/" + j;
                    set.add(a);
                    str.add(s);
                }
            }
        }
        return str;
    }
}