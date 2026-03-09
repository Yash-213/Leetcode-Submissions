# Prefix Sum + Track Minimum from Right | O(n) Java Solution

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To maximize the score, we want to maximize the value of:

    prefixSum[i] - nums[j]   where j > i
So for every index i, we need the smallest value on the right side of the array.
If we know the minimum value to the right of i, we can subtract it from the prefix sum up to i to get the score.

Thus, the idea is:

- Compute prefix sums of the array.

- Traverse from the right side to maintain the minimum value seen so far.

- At each step, compute the possible score and update the maximum.


---


# Approach
<!-- Describe your approach to solving the problem. -->
1. Compute a prefix sum array where sum[i] represents the sum of elements from index 0 to i.

2. Traverse the array from right to left.

3. Maintain a variable min that keeps track of the minimum element on the right side.

4. For each index i, compute:

        score = prefixSum[i] - min

5. Update the maximum score accordingly.

6. Update the minimum value while moving left.

This ensures we always subtract the smallest possible value from the right side, maximizing the score.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
    O(n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
    O(n)

# Code
```java []
class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long[] sum = new long[n];
        sum[0] = nums[0];
        for(int i=1;i<n;i++) sum[i] = sum[i-1] + nums[i];
        long max = Long.MIN_VALUE;
        int min = nums[n-1];
        for(int i = n - 2; i >= 0; i--) {
            min = Math.min(min, nums[i+1]);
            max = Math.max(max, sum[i] - min);
        }
        return max;
    }
}
```