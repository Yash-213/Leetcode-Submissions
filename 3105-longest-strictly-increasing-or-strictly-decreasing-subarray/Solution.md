# Longest Monotonic Subarray | Single Pass | Java & JavaScript

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
A monotonic subarray is either:

- Strictly increasing.
- Strictly decreasing.

We maintain two counters to track the lengths of increasing and decreasing subarrays.

Whenever the current element doesn't continue a particular sequence, we reset that counter to 1.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Initialize inc, dec, and max to 1.
2. Traverse the array starting from index 1.
3. If the current element is greater than the previous element, increment inc and reset dec to 1.
4. If the current element is smaller, increment dec and reset inc to 1.
5. If both are equal, both counters reset to 1.
6. Update the maximum length at every iteration.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(n)$$

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(1)$$

# Code
```javascript []
/**
 * @param {number[]} nums
 * @return {number}
 */
var longestMonotonicSubarray = function (nums) {
    let max = 1;
    let inc = 1;
    let dec = 1;

    for (let i = 1; i < nums.length; i++) {
        inc = nums[i] > nums[i - 1] ? inc + 1 : 1;
        dec = nums[i] < nums[i - 1] ? dec + 1 : 1;

        max = Math.max(max, inc, dec);
    }
    return max;
};
```
```java []
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int l = 1;
        int max = 1;
        int countI = 1;
        int countD = 1;

        while (l < nums.length) {
            if (nums[l] < nums[l - 1]) {
                countD++;
                countI = 1;
            } 
            else if (nums[l] > nums[l - 1]) {
                countI++;
                countD = 1;
            } 
            else {
                countI = 1;
                countD = 1;
            }
            max = Math.max(max, Math.max(countI, countD));
            l++;
        }
        return max;
    }
}
```