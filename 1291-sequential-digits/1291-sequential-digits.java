class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String str = "123456789";
        int lenLow = String.valueOf(low).length();
        int lenHigh = String.valueOf(high).length();
        for (int i = lenLow; i <= lenHigh; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                int num = Integer.parseInt(str.substring(j , j  + i));
                if (num >= low && num <= high) list.add(num);
            }
        }
        return list;
    }
}