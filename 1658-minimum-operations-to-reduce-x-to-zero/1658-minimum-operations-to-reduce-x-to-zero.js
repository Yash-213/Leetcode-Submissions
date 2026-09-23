/**
 * @param {number[]} nums
 * @param {number} x
 * @return {number}
 */
var minOperations = function (nums, x) {
    const n = nums.length;

    let a = -x;
    for (const num of nums) a += num;

    if (a < 0) return -1;
    if (a == 0) return n;

    let count = -1, idx = 0, s = 0;
    for (let i = 0; i < n; i++) {
        s += nums[i];
        while (s > a) s -= nums[idx++];

        if (s == a) count = Math.max(count, i - idx + 1);
    }
    return count < 0 ? -1 : n - count;
};