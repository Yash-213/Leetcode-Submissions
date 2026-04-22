# Simple Brute Force with Character Difference Count (Two Pointers / Hamming Distance Approach)

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem asks us to find all words in queries that can match any word in dictionary with at most 2 character differences.

A straightforward way to think about it is:
- Compare each query word with every word in the dictionary.
- For each pair, count how many positions have different characters.
- If the difference count is ≤ 2, then the query word is valid.

This works because all words are of the same length, so we can directly compare characters at each index.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Initialize an empty result list.
2. Loop through each word in queries.
3. For every query word, compare it with each word in dictionary:
    - Count the number of differing characters.
    - If the count exceeds 2, stop early (optimization).
4. If any dictionary word matches with ≤ 2 differences, add the query word to the result.
5. Return the result list.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(n * m * k)
$$
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$O(n)$

# Code
```java []
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < queries.length; i++) {
            for(int j = 0; j < dictionary.length; j++) {
                boolean flag = check(queries[i], dictionary[j]);
                if(flag) {
                    list.add(queries[i]);
                    break;
                }
            }
        }
        return list;
    }
    static boolean check(String a, String b) {
        int count = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                count++;
            }
            if(count > 2) {
                break;
            }
        }
        return count > 2 ? false : true;
    }
}
```