class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] arr = new String[str.length];
        for (int i = 0; i < str.length; i++) 
            arr[str[i].charAt(str[i].length() - 1) - '1'] = str[i];
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i].substring(0, arr[i].length() - 1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}