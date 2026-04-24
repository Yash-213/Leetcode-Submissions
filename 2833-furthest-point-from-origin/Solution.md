# Swith Case | Beginner Friendly

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Simply apply switch case check every move and maintain dist and blank space.

# Approach
<!-- Describe your approach to solving the problem. -->
1. For every 'L' -> dist++
2. For every 'R' -> dist--
3. For every '_' -> a++

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$O(n)$

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$O(1)$

# Code
```java []
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int dist = 0;
        int a = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    dist--;
                    break;
                case 'R':
                    dist++;
                    break;
                default:
                    a++;
            }
        }
        return Math.abs(dist) + a;
    }
}
```