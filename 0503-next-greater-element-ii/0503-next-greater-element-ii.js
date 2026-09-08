var nextGreaterElements = function(nums) {
    const n = nums.length;
    const arr = new Array(n);
    for (let i = 0; i < n; i++) {
        let flag = true;
        for (let j = i + 1; j < n; j++) {
            if (nums[i] < nums[j]) {
                arr[i] = nums[j];
                flag = false;
                break;
            }
        }
        if (flag) {
            for (let j = 0; j < i; j++) {
                if (nums[i] < nums[j]) {
                    arr[i] = nums[j];
                    flag = false;
                    break;
                }
            }
        }
        if (flag) arr[i] = -1;
    }
    return arr;
};