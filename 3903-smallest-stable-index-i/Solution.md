# Prefix Maximum + Suffix Minimum | O(n) Time | Java

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
For each index `i`, the instability score is:

`max(nums[0..i]) - min(nums[i..n-1])`

So, for every index, we need:

- `prefixMax[i]` → the maximum element from index `0` to `i`
- `suffixMin[i]` → the minimum element from index `i` to `n - 1`

By precomputing these two arrays, we can directly calculate the instability score for every index.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Build the Prefix Maximum Array

`prefixMax[i]` stores the maximum value from index 0 to i.

`prefixMax[i]` = `Math.max(prefixMax[i - 1], nums[i])`;
2. Build the Suffix Minimum Array

`suffixMin[i]` stores the minimum value from index i to the end of the array.
`
suffixMin[i] `= `Math.min(suffixMin[i + 1], nums[i])`;
3. Find the First Stable Index

For every index `i`, calculate:

`prefixMax[i] - suffixMin[i]`

If the result is less than or equal to `k`, the index is stable. Since we iterate from left to right, the first valid index is the smallest stable index.

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
    public int firstStableIndex(int[] nums, int k) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        max[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            max[i] = Math.max(max[i - 1], nums[i]);
        }
        min[nums.length - 1] = nums[nums.length - 1];
        for(int i = nums.length - 2; i > -1; i--) {
            min[i] = Math.min(min[i + 1], nums[i]);
        }
        for(int i = 0; i < nums.length; i++) {
            if(max[i] - min[i] <= k ) {
                return i;
            }
        }
        return -1;
    }
}
```
```javascript []
var firstStableIndex = function (nums, k) {
    const n = nums.length; 
    const prefixMax = new Array(n);
    const suffixMin = new Array(n);
    prefixMax[0] = nums[0];
    for (let i = 1; i < n; i++) 
        prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
    
    suffixMin[n - 1] = nums[n - 1];
    for (let i = n - 2; i >= 0; i--) 
        suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
    
    for (let i = 0; i < n; i++) 
        if (prefixMax[i] - suffixMin[i] <= k) 
            return i;
        
    return -1;
};
```