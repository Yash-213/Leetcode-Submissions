# Evaluate the Bracket Pairs | HashMap + StringBuilder

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The `knowledge` list contains key-value pairs. We store them in a HashMap so we can quickly find the value of any key inside parentheses.

While traversing the string:

- Normal characters are directly added to the result.
- When `(` is found, we search for the corresponding `)`.
- The text between them is the key.
- If the key exists in the map, we append its value.
- Otherwise, we append `"?"`.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Store every key-value pair from `knowledge` in a `HashMap`.
2. Traverse the string using pointer `l`.
3. If the current character isn't `(`, append it to `StringBuilder`.
4. If `(` is found:
    - Find the matching `)`.
    - Extract the key between them.
    - Get its value from the map, or `"?"` if it doesn't exist.
    - Append the value.
5. Continue until the entire string is processed.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(n + k)$$, 
> where n is the string length and k is the total size of the knowledge entries.

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(k + n)$$ 
> for the HashMap and result string.

# Code
```java []
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> list : knowledge)
            map.put(list.get(0), list.get(1));

        StringBuilder sb = new StringBuilder();
        int l = 0;
        while (l < s.length()) {
            if (s.charAt(l) != '(') 
                sb.append(s.charAt(l++));
            else {
                int r = l + 1;
                while (s.charAt(r) != ')') r++;

                String sub = s.substring(l + 1, r);

                map.put(sub, map.getOrDefault(sub, "?"));
                sb.append(map.get(sub));
                
                l = r + 1;
            }
        }
        return sb.toString();
    }
}
```
``` javascript []
var evaluate = function (s, knowledge) {
    const map = new Map();
    for (const list of knowledge)
        map.set(list[0], list[1]);

    let sb = "";
    let l = 0;
    while (l < s.length) {
        if (s[l] != '(')
            sb += s[l++];
        else {
            let r = l + 1;
            while (s[r] != ')') r++;

            const sub = s.substring(l + 1, r);
            sb += map.get(sub) ?? "?";

            l = r + 1;
        }
    }
    return sb;
};
```