
class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int size = 0;

        for (int i = 0; i < n; i++) {
            int[] arr = new int[26];

            for (int j = i; j < n; j++) {
                arr[s.charAt(j) - 'a']++;

                int freq = 0;
                boolean balanced = true;

                for (int k = 0; k < 26; k++) {
                    if (arr[k] == 0)
                        continue;

                    if (freq == 0)
                        freq = arr[k];
                    else if (freq != arr[k]) {
                        balanced = false;
                        break;
                    }
                }

                if (balanced)
                    size = Math.max(size, j - i + 1);
            }
        }
        return size;
    }
}
