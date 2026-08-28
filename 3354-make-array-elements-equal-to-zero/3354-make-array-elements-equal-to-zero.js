var countValidSelections = function (nums) {
    
    let sum = nums.reduce((a, b) => a + b, 0);

    let count = 0;
    let rem = 0;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            let diff = sum - rem;

            if (rem == diff)
                count += 2;
            else if (Math.abs(rem - diff) == 1)
                count++
        }
        rem += nums[i];
    }
    return count;
};