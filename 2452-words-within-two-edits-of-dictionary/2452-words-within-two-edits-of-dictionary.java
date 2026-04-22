class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < queries.length; i++) {
            for(int j = 0; j < dictionary.length; j++) {
                boolean flag = check(queries[i], dictionary[j]);
                if(flag) {
                    list.add(queries[i]);
                    break;
                }
            }
        }
        return list;
    }
    static boolean check(String a, String b) {
        int count = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                count++;
            }
            if(count > 2) {
                break;
            }
        }
        return count > 2 ? false : true;
    }
}