# Flatten the Grid + Collections.rotate() | O(m × n) Time | Java

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Shifting a 2D grid is equivalent to shifting all its elements in a single linear sequence.

Instead of manually moving elements one by one:

1. Flatten the grid into a list.
2. Rotate the list to the right by k positions.
3. Reconstruct the 2D grid from the rotated list.

Java's `Collections.rotate()` handles the rotation efficiently, making the solution simple and readable.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Compute the total number of elements (m × n).
2. Reduce k using modulo to avoid unnecessary full rotations.
3. Traverse the grid and store every element in a list.
4. Rotate the list by k positions.
5. Rebuild the answer by taking n elements at a time.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(m * n)$$

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(m * n)$$


# Code
```java []
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> list = new ArrayList<>();
        int m = grid.length, n = grid[0].length;
        k = k % (m * n);
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                list.add(grid[i][j]);

        Collections.rotate(list, k);
        List<List<Integer>> outer = new ArrayList<>();
        for (int i = 0; i < list.size(); i += n)
            outer.add(new ArrayList<>(list.subList(i,
                    Math.min(i + n, list.size()))));
        return outer;
    }
}
```