/**
 * @param {number[]} nums
 * @return {number}
 */
var minMoves2 = function (nums) {
    nums.sort((a, b) => a - b);
    let mid = nums[Math.floor(nums.length / 2)], move = 0;
    for (const num of nums) move += Math.abs(mid - num);
    return move;
};