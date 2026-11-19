/**
 * @param {number[]} nums
 * @return {number}
 */
var minimizeSum = function(nums) {
    let min1 = Infinity, min2 = Infinity, min3 = Infinity;
    let max1 = -Infinity, max2 = -Infinity, max3 = -Infinity;

    for (const x of nums) {

        // Find 3 smallest
        if (x < min1) {
            min3 = min2;
            min2 = min1;
            min1 = x;
        } else if (x < min2) {
            min3 = min2;
            min2 = x;
        } else if (x < min3) {
            min3 = x;
        }

        // Find 3 largest
        if (x > max1) {
            max3 = max2;
            max2 = max1;
            max1 = x;
        } else if (x > max2) {
            max3 = max2;
            max2 = x;
        } else if (x > max3) {
            max3 = x;
        }
    }

    return Math.min(
        max1 - min3,
        max2 - min2,
        max3 - min1
    );
};