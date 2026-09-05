/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var firstStableIndex = function (nums, k) {
    const n = nums.length;
    let suffixMin = new Array(n);

    suffixMin[n - 1] = nums[n - 1];
    for (let i = n - 2; i > -1; i--) 
        suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
    

    let prefixMax = 0;
    for (let i = 0; i < n; i++) {
        prefixMax = Math.max(prefixMax, nums[i]);
        if (prefixMax - suffixMin[i] <= k) return i;
    }

    return -1;
};