/**
 * @param {number[]} digits
 * @return {number}
 */
var totalNumbers = function (digits) {
    const set = new Set();
    let count = 0;
    for (let i = 0; i < digits.length; i++) {
        for (let j = 0; j < digits.length; j++) {
            for (let k = 0; k < digits.length; k++) {
                if (i != j && j != k && k != i) {
                    if (digits[i] != 0) {
                        let num = (digits[i] * 100) + (digits[j] * 10) + digits[k];
                        if (num % 2 == 0) set.add(num);
                    }
                }
            }
        }
    }
    return set.size;
};