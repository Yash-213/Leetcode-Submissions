/**
 * @param {number} n
 * @return {boolean}
 */
var canAliceWin = function (n) {
    let remove = 10;
    let aliceWin = true;
    while (n >= remove) {
        n -= remove;
        remove--;
        aliceWin = !aliceWin;
    }
    return !aliceWin;
};