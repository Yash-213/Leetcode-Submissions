/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @param {number} d
 * @return {number}
 */
var findTheDistanceValue = function (arr1, arr2, d) {
    let ans = 0;
    for (const x of arr1) {
        let flag = true;
        for (const y of arr2)
            if (Math.abs(x - y) <= d) {
                flag = false;
                break;
            }
        if (flag) ans++;
    }
    return ans;
};