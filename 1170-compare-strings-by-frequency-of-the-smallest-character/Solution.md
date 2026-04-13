# Simple Brute Force Solution Using Frequency of Smallest Character (Java)

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem asks us to compare strings based on a special function f(s), which counts the frequency of the smallest character in a string.

So the idea is:
- For each string, find its smallest character.
- Count how many times that smallest character appears.
- Then for each query, compare its frequency with all words and count how many words have a strictly greater frequency.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Create a helper function freq(s):
    - Find the smallest character in the string.
    - Count its occurrences.
2. Build frequency arrays:
    - One for queries
    - One for words
3. For each query:
    - Iterate through all word frequencies
    - Count how many are greater than the current query’s frequency
4. Store the result in the answer array.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(q × w × k)$$

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(q + w)
$$
# Code
```java []
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
```