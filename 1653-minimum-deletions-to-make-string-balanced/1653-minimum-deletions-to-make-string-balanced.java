class Solution {
    public int minimumDeletions(String s) {
        int min = 0, countB = 0;
        for(int c : s.toCharArray()) {
            if(c == 'b'){
                countB++;
            }else if(countB != 0){
                min++;
                countB--;
            }
        }
        return min;
    }
}