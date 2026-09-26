/**
 * @param {string} s
 * @param {string[][]} knowledge
 * @return {string}
 */
var evaluate = function(s, knowledge) {
    const map = new Map();
        for (const list of knowledge)
            map.set(list[0], list[1]);

        let sb = "";
        let l = 0;
        while (l < s.length) {
            if (s[l] != '(') 
                sb += s[l++];
            else {
                let r = l + 1;
                while (s[r] != ')') r++;

                const sub = s.substring(l + 1, r);
                sb += map.get(sub) ?? "?";
                
                l = r + 1;
            }
        }
        return sb;
};