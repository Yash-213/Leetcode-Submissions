class Solution {
    public List<String> letterCombinations(String digits) {
        return padRet("", digits);
    }

    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        if(digit < 7){
            for (int i = (digit-2) * 3; i < (digit-1) * 3 ; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padRet(p + ch, up.substring(1)));
            }
        }
        else if (digit == 9){
            for (int i = (digit-2) * 3 + 1; i < ((digit-1) * 3) + 2 ; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
            }
        }else if (digit == 8){
            for (int i = (digit-2) * 3 + 1; i < ((digit-1) * 3) + 1 ; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
            }
        }else if (digit == 7){
            for (int i = (digit-2) * 3; i < ((digit-1) * 3) + 1 ; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
            }
        }
        return list;
    }
}