/**
 * @param {number[]} nums
 * @param {number[]} l
 * @param {number[]} r
 * @return {boolean[]}
 */
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