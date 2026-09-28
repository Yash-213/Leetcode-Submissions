/**
 * @param {string} s
 * @return {number}
 */
var maxDepth = function (s) {
    const sk = [];
    let max = 0;
    let bestMax = 0;
    for (const c of s) {
        if (c == '(') {
            sk.push(c);
            max++;
        } else if (c == ')') {
            sk.pop();
            max--;
        }
        bestMax = Math.max(max, bestMax);
    }
    return bestMax;
};