/**
 * @param {string} s
 * @return {boolean}
 */
var doesAliceWin = function (s) {
    for (const ch of s)
        if ("aeiou".indexOf(ch) != -1) return true;

    return false;
};