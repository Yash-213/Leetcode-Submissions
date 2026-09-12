var countSpecialIntegers = function(nums) {
    let n = nums.length;
    const map = new Map();
    for (let i = 0; i < n; i++) 
        map.set(nums[i], (map.get(nums[i]) || 0) + 1);

    let count = 0;
    for (let i = 0; i < n - 2; i++) {
        if (map.get(nums[i]) != 3) continue;
        for (let j = i + 1; j < n - 1; j++) {
            const k = j + j - i;
            if (nums[i] === nums[j] && k < n && nums[k] === nums[i]) count++;
        }
    }
    return count;
};