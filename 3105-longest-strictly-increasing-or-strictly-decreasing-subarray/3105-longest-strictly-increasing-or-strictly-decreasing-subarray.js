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