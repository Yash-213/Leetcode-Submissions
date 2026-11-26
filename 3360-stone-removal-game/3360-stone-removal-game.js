/**
 * @param {number} n
 * @return {boolean}
 */
var canAliceWin = function (n) {
    let flag = true;
    let remove = 10;
    while (n > 0) {
        if (n - remove < 0 && !flag) return true;
        if (n - remove < 0 && flag) return false;
        n = n - remove;
        remove--;
        flag = !flag;
    }
    return !flag;
};