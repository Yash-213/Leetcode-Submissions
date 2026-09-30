/**
 * @param {string} seq
 * @return {number[]}
 */
var maxDepthAfterSplit = function(seq) {
    const n = seq.length;
    const arr = new Array(n);
    let count = 0;

    for (let i = 0; i < n; i++) {
        if (seq.charAt(i) === '(') {
            arr[i] = count % 2;
            count++;
        } else {
            count--;
            arr[i] = count % 2;
        }
    }
    return arr;
};