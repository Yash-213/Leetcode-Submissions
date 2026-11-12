/**
 * @param {number[]} nums
 * @return {number}
 */
var longestMonotonicSubarray = function (nums) {
    let l = 1;
    let max = 1;
    let countI = 1;
    let countD = 1;

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
};