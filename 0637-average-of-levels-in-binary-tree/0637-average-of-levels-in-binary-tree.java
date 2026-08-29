/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        while (!que.isEmpty()) {
            int levelSize = que.size();

            double avg = 0;

            for (int i = 0; i < levelSize; i++) {

                TreeNode currentNode = que.poll();
                avg += currentNode.val;

                if (currentNode.left != null) {
                    que.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    que.offer(currentNode.right);
                }
            }

            avg = avg / levelSize;
            ans.add(avg);
        }
        return ans;
    }
}