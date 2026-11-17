/**
 * @param {number[]} nums
 * @return {number}
 */
var minOperations = function(nums) {
    const n = nums.length;
        let count = 0;
        for (let i = 0; i < n - 2; i++) {
            if (nums[i] === 0) {
                nums[i] = 1;
                nums[i + 1] = nums[i + 1] === 1 ? 0 : 1;
                nums[i + 2] = nums[i + 2] === 1 ? 0 : 1;
                count++;
            }
        }
        for (const num of nums)
            if (num === 0)
                return -1;
        return count;
};