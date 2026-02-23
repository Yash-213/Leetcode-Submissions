class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        int l = 0, r = k;
        while(r <= s.length()){
            set.add(s.substring(l, r));
            l++;
            r++;
        }
        return set.size() == (1 << k);
    }
}