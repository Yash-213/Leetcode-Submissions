var targetIndices = function (nums, target) {
    const n = nums.length;
    
    nums.sort((a, b) => a - b);

    const list = [];
    for (let i = 0; i < n; i++) 
        if (nums[i] === target) list.push(i);
    
    return list;
};