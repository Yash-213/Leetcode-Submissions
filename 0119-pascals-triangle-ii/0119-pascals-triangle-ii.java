class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        int a = rowIndex;
        result.add(Arrays.asList(1));
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1); 
            for (int j = 1; j < i; j++) {
                row.add(prev.get(j - 1) + prev.get(j));
            }
            row.add(1);
            result.add(row);
        }

        return result.get(a);
    }
}