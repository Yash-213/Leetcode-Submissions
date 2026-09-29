class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += k) {
            StringBuilder sub = new StringBuilder(
                s.substring(i, Math.min(i + k, s.length()))
            );

            if ((i / k) % 2 == 0) 
                sub.reverse();
            
            sb.append(sub);
        }
        return sb.toString();
    }
}
