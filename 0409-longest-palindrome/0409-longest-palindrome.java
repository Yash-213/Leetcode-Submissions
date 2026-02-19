class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        } 
        
        int length = 0;
        boolean hasOdd = false;
        
        for (int value : map.values()) {
            if (value % 2 == 0) {
                length += value;
            } else {
                length += value - 1;
                hasOdd = true;
            }
        }
        
        if (hasOdd) {
            length += 1;
        }
        
        return length;
    }
}
