class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freqP = new int[26];
        for (char c : p.toCharArray())
            freqP[c - 'a']++;
            
        // String fp = Arrays.toString(freqP);

        int n = s.length();
        int m = p.length();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n - m + 1; i++) {

            String sub = s.substring(i, i + m);
            int[] freqS = new int[26];

            for (char ch : sub.toCharArray())
                freqS[ch - 'a']++;

            // String fs = Arrays.toString(freqS);
            if (Arrays.equals(freqS, freqP))
                list.add(i);
        }
        return list;
    }
}