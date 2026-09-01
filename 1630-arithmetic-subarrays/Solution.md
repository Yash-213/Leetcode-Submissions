# Copy + Sort Each Query | Arithmetic Difference Check | Java

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
For every query `[l[i], r[i]]`:

1. Extract the corresponding subarray.
2. Sort it.
3. Calculate the common difference using the first two elements.
4. Check whether every consecutive pair has the same difference.

If all differences are equal, the subarray can be rearranged into an arithmetic sequence.

# Approach
<!-- Describe your approach to solving the problem. -->
For each query:
- Copy `nums[l...r]`
- Sort the copied subarray
- Calculate the first difference
- Check all remaining consecutive differences

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(n log n)$$

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(n)$$

# Code
```java []
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> boolList = new ArrayList<>();

        for (int i = 0; i < l.length; i++) 
            boolList.add(isArithmeticSeq(nums, l[i], r[i]));

        return boolList;
    }

    private static boolean isArithmeticSeq(int[] arr, int l, int r) {
        
        int n = r - l + 1;
        if (n <= 2) return true;

        int[] nums = Arrays.copyOfRange(arr, l, r + 1);
        Arrays.sort(nums);

        int diff = nums[1] - nums[0];

        for (int i = 2; i < nums.length; i++) 
            if (nums[i] - nums[i - 1] != diff) 
                return false;

        return true;
    }
}
```
```javascript []
var checkArithmeticSubarrays = function (nums, l, r) {
    const list = [];
    for (let i = 0; i < l.length; i++) 
        list.push(isArithmaticSeq(nums, l[i], r[i]));
    
    return list;
};

var isArithmaticSeq = function (arr, l, r) {

    const nums = arr.slice(l, r + 1);

    if (nums.length <= 2) return true;

    nums.sort((a, b) => a - b);

    const diff = nums[1] - nums[0];
    for (let i = 2; i < nums.length; i++) 
        if (diff !== nums[i] - nums[i - 1]) 
            return false;
        
    return true;
}
```