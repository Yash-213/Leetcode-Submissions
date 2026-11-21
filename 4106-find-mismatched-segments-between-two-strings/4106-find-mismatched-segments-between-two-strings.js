/**
 * @param {string} s1
 * @param {string} s2
 * @return {string[][]}
 */
var findMismatchedSegments = function (s1, s2) {
    const list = [];
    let i = 0;

    while (i < s1.length) {
        if (s1[i] === s2[i]) {
            i++;
            continue;
        }

        const st = i;

        while (i < s1.length && s1[i] !== s2[i]) 
            i++;

        list.push([
            s1.slice(st, i),
            s2.slice(st, i)
        ]);
    }

    return list;
};