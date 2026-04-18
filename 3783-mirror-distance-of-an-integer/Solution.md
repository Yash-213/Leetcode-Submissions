# Simple | Beggeiner Friendly

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Reverse number and subtract from original no.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Reverse No
2. Substract from original number

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(n)
$$
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(1)
$$
# Code
```java []
class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }
    static int reverse(int n) {
        int r = 0;
        while(n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }
}
```