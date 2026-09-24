/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
var fourSum = function (nums, target) {
    const n = nums.length;
    const list = [];
    nums.sort((a, b) => a - b);
    for (let i = 0; i < n - 3; i++) {
        if (i > 0 && nums[i] === nums[i - 1]) continue;

        for (let j = i + 1; j < n - 2; j++) {
            if (j > i + 1 && nums[j] === nums[j - 1]) continue;
            const t = target - nums[i] - nums[j];
            let l = j + 1, r = n - 1;
            while (l < r) {
                const sum = nums[l] + nums[r];
                if (sum === t) {
                    list.push([nums[i], nums[j], nums[l++], nums[r--]]);

                    while (l < r && nums[l] === nums[l - 1]) l++;
                } else if (sum < t) l++;
                else r--;
            }
        }
    }
    return list;
};