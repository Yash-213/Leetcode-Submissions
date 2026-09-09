/**
 * @param {number} n
 * @return {number}
 */
var countCommas = function (n) {
    if (n < 1000) return 0;
    let c = 0;
    let a = 1000;

    while (a <= n) {
        c += n - a + 1;
        a *= 1000;
    }
    return c;
};