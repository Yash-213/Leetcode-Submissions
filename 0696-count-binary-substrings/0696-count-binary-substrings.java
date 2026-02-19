class Solution {
    public int countBinarySubstrings(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 0;
        int i = 0, j = 0, count = 0;

        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                count++;
            }else{
                list.add(count);
                count = 1;
                i = j;
            }
            j++;
        }
        list.add(count);
        int min = 0;
        for(int a = 0; a < list.size() - 1; a++){
            min = Math.min(list.get(a), list.get(a+1));
            ans += min;
        }
        return ans;
    }
}