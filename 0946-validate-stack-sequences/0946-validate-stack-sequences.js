/**
 * @param {number[]} pushed
 * @param {number[]} popped
 * @return {boolean}
 */
var validateStackSequences = function (pushed, popped) {
    const sk = [];
    let idx = 0;

    for (const num of pushed) {
        sk.push(num);

        while (sk.length > 0 && sk[sk.length - 1] === popped[idx]) {
            sk.pop();
            idx++;
        }
    }

    return sk.length === 0;
};