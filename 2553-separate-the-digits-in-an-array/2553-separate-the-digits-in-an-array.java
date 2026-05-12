class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            ArrayList<Integer> inner = sepration(n);
            for (int i = inner.size() - 1; i > -1; i--)
                list.add(inner.get(i));
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }

    static ArrayList<Integer> sepration(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            int a = n % 10;
            n /= 10;
            list.add(a);
        }
        return list;
    }
}