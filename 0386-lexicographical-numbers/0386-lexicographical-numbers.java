class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 9; i++)
            lexical(list, i, n);

        return list;
    }

    private static void lexical(ArrayList<Integer> list, int i, int n) {
        if (i > n) return;
        
        list.add(i);
        i *= 10;

        for (int j = 0; j <= 9; j++)
            lexical(list, i + j, n);
    }
}