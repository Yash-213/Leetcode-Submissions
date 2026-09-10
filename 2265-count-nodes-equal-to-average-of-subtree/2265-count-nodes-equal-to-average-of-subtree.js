/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var averageOfSubtree = function(root) {
    let ans = 0;
    const dfs = function(root) {
    if (root === null) return [0, 0]

    const left = dfs(root.left);
    const right = dfs(root.right);

    const sum = left[0] + right[0] + root.val;
    const count = left[1] + right[1] + 1;

    if (Math.floor(sum / count) === root.val) ans++;
    return [sum, count];
}
    dfs(root);
    return ans;
};
