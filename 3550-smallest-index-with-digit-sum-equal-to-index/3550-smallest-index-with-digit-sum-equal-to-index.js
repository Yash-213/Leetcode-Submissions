/**
 * @param {number[]} nums
 * @return {number}
 */
var smallestIndex = function (nums) {
    for (let i = 0; i < nums.length; i++) {
        const sum = digitSum(nums[i]);
        if (i === sum) return i;
    }
    return -1;
};
var digitSum = function (n) {
    let sum = 0;
    while (n !== 0) {
        sum += n % 10;
        n = Math.floor(n / 10);
    }
    return sum;
};