var threeSum = function (nums) {
    const n = nums.length;
    const list = [];
    nums.sort((a, b) => a - b);
    for (let i = 0; i < n - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        const target = nums[i] * (-1);
        let l = i + 1, r = n - 1;
        while (l < r) {
            const sum = nums[l] + nums[r];
            if (sum == target) {
                const inner = [];
                inner.push(nums[i]);
                inner.push(nums[l]);
                inner.push(nums[r]);
                list.push(inner);
                l++;
                r--;
                while (nums[l] === nums[l - 1]) l++;
            }
            else if (sum < target) l++;
            else r--;
        }
    }
    return list;
};