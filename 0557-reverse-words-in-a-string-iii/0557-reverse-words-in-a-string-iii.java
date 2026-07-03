class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) 
            sb.append(new StringBuilder(arr[i]).reverse()).append(" ");
            
        return sb.toString().trim();
    }
}