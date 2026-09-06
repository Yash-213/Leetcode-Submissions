/**
 * @param {number[]} nums
 * @return {number}
 */
var countSpecialIntegers = function(nums) {
    const set = new Set();
    const check = new Set();

    let count = 0;
    let i = 0;

    while (i < nums.length) {
        let j = i + 1;
        while (j < nums.length && nums[j] == nums[i]) j++;

        if (!set.has(nums[i])) {
            set.add(nums[i]);
            count++;
        } else if (!check.has(nums[i])) {
            check.add(nums[i]);
            count--;
        }
        i = j;
    }
    return count;
};