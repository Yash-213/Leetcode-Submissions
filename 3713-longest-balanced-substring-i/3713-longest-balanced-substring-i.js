/**
 * @param {string} s
 * @return {number}
 */
var longestBalanced = function(s) {
    const n = s.length;
        let size = 0;

        for (let i = 0; i < n; i++) {
            const arr = new Array(26).fill(0);

            for (let j = i; j < n; j++) {
                arr[s.charCodeAt(j) - 'a'.charCodeAt(0)]++;

                let freq = 0;
                let balanced = true;

                for (let k = 0; k < 26; k++) {
                    if (arr[k] === 0)
                        continue;

                    if (freq === 0)
                        freq = arr[k];
                    else if (freq !== arr[k]) {
                        balanced = false;
                        break;
                    }
                }

                if (balanced)
                    size = Math.max(size, j - i + 1);
            }
        }
        return size;
};