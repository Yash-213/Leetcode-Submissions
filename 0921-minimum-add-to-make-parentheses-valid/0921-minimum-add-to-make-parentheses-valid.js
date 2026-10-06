var minAddToMakeValid = function (s) {
    const sk = [];
    for (const ch of s) {
        if (ch === ')') {
            if (sk.length !== 0 && ch !== sk.at(-1)) sk.pop();
            else sk.push(ch);
        } else  sk.push(ch);
    }
    return sk.length;
};