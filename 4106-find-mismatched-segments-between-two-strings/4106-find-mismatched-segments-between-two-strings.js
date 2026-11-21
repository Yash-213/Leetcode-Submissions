/**
 * @param {string} s1
 * @param {string} s2
 * @return {string[][]}
 */
var findMismatchedSegments = function (s1, s2) {
    const n = s1.length;
    let l = 0;
    let r = 0;
    const list = [];
    while (l < n) {
        if (s1[l] === s2[r]) {
            l++;
            r++;
        } else {
            const inner = [];
            let sb1 = "";
            let sb2 = "";
            while (l < n && s1[l] !== s2[r]) {
                sb1 += s1[l++];
                sb2 += s2[r++];
            }
            inner.push(sb1);
            inner.push(sb2);
            list.push(inner);
        }
    }
    return list;
};