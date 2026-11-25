/**
 * @param {number[]} nums
 * @return {number}
 */
var maxAlternatingSum = function (nums) {
    const n = nums.length;
    
    nums = nums.map(x => Math.abs(x));
    nums.sort((a, b) => a - b);
    let small = 0;
    let big = 0;
    const mid = Math.floor(n / 2);

    nums.forEach((num, i) => {
        if (i < mid) small += num ** 2;
        else big += num ** 2;
    });

    return big - small;
};