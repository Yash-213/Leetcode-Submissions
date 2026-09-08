/**
 * @param {string} s
 * @return {string}
 */
var removeOuterParentheses = function(s) {
    let str = "";
    let sk = [];
    for (let i = 0; i < s.length; i++) {
        if (s[i] === '(') {
            if (sk.length !== 0) str += '(';
            sk.push(s[i]);
        } else {
            sk.pop();
            if (sk.length !== 0) str += ')';
        }
    }
    return str;
};