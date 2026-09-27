/**
 * @param {string} s
 * @return {string}
 */
var reverseParentheses = function (s) {
    const st = [];
    let sb = "";

    for (const ch of s) {
        if (ch === '(') {
            st.push(sb);
            sb = "";
        }
        else if (ch == ')') {
            sb = sb.split("").reverse().join("");
            let prev = st.pop();
            prev += sb;
            sb = prev;
        }
        else sb += ch;
    }

    return sb;
};