class Solution {
    public String[] assignUmbrella(int[] rain) {
        String answer[] = new String[rain.length];
        int alice = 0;
        int bob = 0;
        for(int i=0;i<rain.length;i++){
            if(i+1 < rain.length && rain[i] == 1 && rain[i+1] == 1){
                if(alice <= bob){
                    answer[i] = "Alice";
                    alice++;
                }else{
                    answer[i] = "Bob";
                    bob++;
                }
            }else if(rain[i] == 0){
                answer[i] = "None";
            }else{
                answer[i] = "Bob";
                bob++;
            }
        }
        return answer;
    }
}