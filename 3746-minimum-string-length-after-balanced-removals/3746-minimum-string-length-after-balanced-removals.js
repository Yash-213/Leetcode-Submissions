/**
 * @param {string} s
 * @return {number}
 */
var minLengthAfterRemovals = function(s) {
    let count = 0;

    for (const ch of s) 
        count += ch === 'a' ? 1 : -1;
    
    return Math.abs(count);
};
