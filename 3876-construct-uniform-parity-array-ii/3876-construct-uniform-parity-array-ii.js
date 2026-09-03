/**
 * @param {number[]} nums1
 * @return {boolean}
 */
var uniformArray = function(nums1) {
    const n = nums1.length;
    nums1.sort((a, b) => a - b);
    for (let e = 0; e <= 1; e++) {
        let flag = true;
        for (let i = 0; i < n; i++) {
            let check = false;
            if (nums1[i] % 2 == e) check = true;
            if (!check) {
                for (let j = 0; j < n; j++) {
                    if (i == j) continue;
                    let diff = nums1[i] - nums1[j];
                    if (diff >= 1 && diff % 2 === e) {
                        check = true;
                        break;
                    }
                }
            }
            if (!check) {
                flag = false;
                break;
            }
        }
        if (flag) return true;
    }
    return false;
};