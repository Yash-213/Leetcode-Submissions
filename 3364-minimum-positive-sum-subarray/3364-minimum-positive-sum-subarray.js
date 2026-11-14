
/**
 * @param {number[]} nums
 * @param {number} l
 * @param {number} r
 * @return {number}
 */
var minimumSumSubarray = function (nums, l, r) {
    let minPositive = Infinity;

    while (l <= r) {
        let sum = 0;

        for (let i = 0; i < l; i++) 
            sum += nums[i];

        if (sum > 0) 
            minPositive = Math.min(minPositive, sum);

        for (let i = l; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - l];

            if (sum > 0) 
                minPositive = Math.min(minPositive, sum);
        }

        l++;
    }

    return minPositive === Infinity ? -1 : minPositive;
};
