class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String s = "";
        for (int i = 0; i < words.length; i++) {
            s = s + str.charAt(map(weights, words[i]));
        }
        return s;
    }
    static int map(int[] weights, String str){
        int sum = 0;
        for (char ch : str.toCharArray()) {
            sum += weights[ch - 'a'];
        }
        return 25 - (sum % 26);
    }
}