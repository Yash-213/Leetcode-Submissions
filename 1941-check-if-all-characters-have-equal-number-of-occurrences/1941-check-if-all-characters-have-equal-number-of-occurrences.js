/**
 * @param {string} s
 * @return {boolean}
 */
var areOccurrencesEqual = function(s) {
    const freq = new Array(26).fill(0);
    for (const c of s) 
        freq[c.charCodeAt(0) - 97]++;
        
    let a = 0;
    for (const i of freq) {
        if (i === 0) continue;
        if (a === 0) a = i;
        if (a !== i) return false;
    }
    return true;
};