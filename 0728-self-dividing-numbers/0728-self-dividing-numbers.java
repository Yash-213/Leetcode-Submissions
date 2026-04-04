class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            boolean flag = true;
            int n = i;
            while(n != 0) {
                int a = n % 10;
                if(a == 0 || i % a != 0) {
                    flag = false;
                    break;
                }
                n /= 10;
            }
            if(flag) list.add(i);
        }
        return list;
    }
}