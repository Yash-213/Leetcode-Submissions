class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] arr = freqArr(queries);
        int[] arr2 = freqArr(words);
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int count = 0;
            for(int j = words.length - 1; j > -1; j--) {
                if(arr2[j] > arr[i]) count++;
            }
            ans[i] = count;
        }
        return ans;
    }
    static int[] freqArr(String[] s) {
        int[] arr = new int[s.length];
        for(int i = 0; i < s.length; i++) {
            arr[i] = freq(s[i]);
        }
        return arr;
    }
    static int freq(String s) {
        char a = s.charAt(0);
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < a) {
                a = s.charAt(i);
            }
        }
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == a) count++;
        }
        return count;
    }
}