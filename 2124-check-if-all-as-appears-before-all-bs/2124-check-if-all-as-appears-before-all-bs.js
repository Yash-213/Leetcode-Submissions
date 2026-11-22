/**
 * @param {string} s
 * @return {boolean}
 */
var checkString = function (s) {
    let bAppear = false;
    for (const c of s) {
        if (c === 'b') bAppear = true;
        if (bAppear && c === 'a') return false;
    }
    return true;
};