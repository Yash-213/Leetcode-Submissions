# Greedy: Sort Processors Descending & Tasks Ascending | O(n log n) | Java

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Each processor handles exactly 4 tasks, and the processor's completion time is determined by:

`processorTime + largest task assigned to it
`
To minimize the overall processing time:

- Give the fastest processors (small initialization time) the largest tasks.
- Give the slowest processors (large initialization time) the smallest tasks.

This balance minimizes the maximum finishing time.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Sort processorTime in descending order.
2. Sort tasks in ascending order.
3. Divide the tasks equally among processors (4 tasks each).
4. For each processor:
    - Compute the maximum completion time among its assigned tasks.
5. Return the maximum completion time over all processors.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(nlogn)$$

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(1)$$

# Code
```java []
class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime, Collections.reverseOrder());
        Collections.sort(tasks);
        int n = tasks.size() / processorTime.size();
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < processorTime.size(); i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i * n; j < Math.min((i + 1) * n, tasks.size()); j++)
                max = Math.max(max, processorTime.get(i) + tasks.get(j));
            best = Math.max(best, max);
        }
        return best;
    }
}
```
```java []
class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime, Collections.reverseOrder());
        Collections.sort(tasks);
        int max = 0;
        for (int i = 0; i < processorTime.size(); i++) {
            max = Math.max(max,
                    processorTime.get(i) + tasks.get(i * 4 + 3));
        }

        return max;
    }
}
```