# Bit Manipulation | Build Mask of All 1s and XOR | Java Solution

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->The complement of a number means flipping all bits in its binary representation.
However, we should only flip the bits that exist in the number and ignore leading zeros.

For example:

    n = 5
    binary = 101
    complement = 010 = 2

To flip the bits correctly, we first create a mask consisting of all 1s that has the same bit length as n. Then we use the XOR operation to flip the bits.

# Approach
<!-- Describe your approach to solving the problem. -->Create a variable m initialized to 1.

Keep expanding m until it becomes a number consisting of all 1s that covers the bit length of n.

This is done using left shift:

``m = (m << 1) + 1
``
Once the mask is ready, perform:

``result = n ^ m``

XOR with the mask flips all the bits of n, giving the complement.

Example:

    n = 5  -> 101
    m = 7  -> 111
    ---------------
    n ^ m  -> 010 = 2

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
    O(log n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
    O(1)

# Code
```java []
class Solution {
    public int findComplement(int num) {
        int m = 1;
        while(m < num) {
            m = (m << 1) + 1;
        }
        return num ^ m;
    }
}
```