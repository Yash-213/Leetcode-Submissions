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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Deque<TreeNode> dq = new LinkedList<>();
        dq.offer(root);

        boolean reverse = false;

        while (!dq.isEmpty()) {
            int levelSize = dq.size();
            List<Integer> list = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {

                    TreeNode currentNode = dq.poll();
                    list.add(currentNode.val);

                    if (currentNode.left != null) {
                        dq.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        dq.addLast(currentNode.right);
                    }
                } else {

                    TreeNode currentNode = dq.pollLast();
                    list.add(currentNode.val);

                    if (currentNode.right != null) {
                        dq.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        dq.addFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            ans.add(list);
        }
        return ans;
    }
}