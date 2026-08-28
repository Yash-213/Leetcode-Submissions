/**
 * @param {string} s
 * @return {number}
 */
var countGoodSubstrings = function(s) {
    const freq = new Array(26).fill(0);
    let l = 0;
    let r = 0;
    let count = 0;
    const ch = s.split('');
    while (r < ch.length) {
        while (l <= r && r - l + 1 > 3) {
            freq[ch[l].charCodeAt(0) - 'a'.charCodeAt(0)]--;
            l++;
        }
        freq[ch[r].charCodeAt(0) - 'a'.charCodeAt(0)]++;
        if (r - l + 1 == 3 
                && freq[ch[l].charCodeAt(0) - 'a'.charCodeAt(0)] == 1
                && freq[ch[r].charCodeAt(0) - 'a'.charCodeAt(0)] == 1
            )
            count++;
        r++;
    }
    return count;
};