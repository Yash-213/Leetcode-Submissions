# Validate Stack Sequences | Stack Simulation

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We simulate the stack operations using the `pushed` sequence.

Whenever the top of the stack matches the current element in `popped`, we can pop it immediately. If all elements in `popped` can be matched this way, the sequences are valid.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Traverse the `pushed` array and push each element onto the stack.
2. After every push, check whether the stack's top matches `popped[idx]`.
3. If they match, pop the element and move `idx` forward.
4. Continue until all elements are processed.
5. If the stack is empty at the end, the sequences are valid.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(n)$$

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(n)$$

# Code
```java []
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        Stack<Integer> sk = new Stack<>();

        int l = 0;
        int idx = 0;

        while (l < n && idx < n) {

            sk.push(pushed[l++]);

            while (!sk.isEmpty() && sk.peek() == popped[idx]) {
                sk.pop();
                idx++;
            }
        }

        return sk.isEmpty();
    }
}
```
```javascript []
var validateStackSequences = function (pushed, popped) {
    const sk = [];
    let idx = 0;

    for (const num of pushed) {
        sk.push(num);

        while (sk.length > 0 && sk[sk.length - 1] === popped[idx]) {
            sk.pop();
            idx++;
        }
    }

    return sk.length === 0;
};
```