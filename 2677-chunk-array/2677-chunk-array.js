/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const chunked = [];
    let idx = 0;

    while (idx < arr.length) {
        chunked.push(arr.slice(idx, idx + size))
        idx += size;
    }
    return chunked;
};
