# HashSet + Min/Max Traversal | O(n + R) Time | Java

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem guarantees that the smallest and largest values of the original range are present.

So, instead of sorting the array:

- Find the minimum and maximum values.
- Store all existing numbers in a HashSet.
- Traverse the range from min to max.
- Any number not present in the set is missing.

This directly finds all missing elements while keeping them in sorted order.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Traverse the array once:
    - Insert every element into a HashSet.
    - Track the minimum and maximum values.
2. Iterate from min to max.
3. If a number is not present in the HashSet, add it to the answer.
4. Return the list.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(n + R)$$
> Building the `HashSet` and finding `min`/`max`: `O(n)`
Traversing the range: `O(R)`
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(n)$$

# Code
```java []
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        for (int n : nums) {
            set.add(n);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++)
            if (!set.contains(i)) list.add(i);

        return list;
    }
}
```
```java []
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) 
            list.add(i);
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (nums[j] == list.get(i)) {
                list.remove(i);
                j++;
                i--;
            }
        }
        return list;
    }
}
```
```java []
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = min; i <= max; i++) set.add(i);
        for (int n : nums) set.remove(n);
        return new ArrayList<>(set);
    }
}
```