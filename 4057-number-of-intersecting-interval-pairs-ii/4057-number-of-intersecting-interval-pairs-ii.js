/**
 * @param {number[][]} intervals
 * @return {number}
 */
var countIntersectingIntervals = function (intervals) {
    const n = intervals.length;
    const s = new Array(n);
    const e = new Array(n);

    for (let i = 0; i < n; i++) {
        s[i] = intervals[i][0];
        e[i] = intervals[i][1];
    }

    s.sort((a, b) => a - b);
    e.sort((a, b) => a - b);

    let count = 0;
    let j = 0;

    for (let i = 0; i < n; i++) {
        while (j < n && e[j] < s[i]) {
            j++;
        }

        count += i - j;
    }

    return count;
};
