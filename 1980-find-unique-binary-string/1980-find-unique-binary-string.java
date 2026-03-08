class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> ans = new ArrayList<>();
        possibleList(ans, "", nums.length);
        for(int i = 0; i < ans.size(); i++) {
            boolean flag = true;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j].equals(ans.get(i))){ 
                    flag = false;
                    break;
                }
            }
            if(flag) return ans.get(i);
        }
        return "";
    }
    static void possibleList(ArrayList<String> list, String n, int idx) {
        if (idx == 0) {
            list.add(n);
            return;
        }
        possibleList(list, n + "0", idx -1);
        possibleList(list, n + "1", idx -1);
    }
}