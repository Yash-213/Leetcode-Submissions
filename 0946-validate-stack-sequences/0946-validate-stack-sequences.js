/**
 * @param {number[]} pushed
 * @param {number[]} popped
 * @return {boolean}
 */
var validateStackSequences = function(pushed, popped) {
    const n = pushed.length;
        const sk = new Stack();

        let l = 0;
        let idx = 0;

        while (l < n && idx < n) {

            sk.push(pushed[l++]);

            while (!sk.isEmpty() && sk.peek() == popped[idx]) {
                sk.pop();
                idx++;
            }
        }

        return sk.isEmpty();
};