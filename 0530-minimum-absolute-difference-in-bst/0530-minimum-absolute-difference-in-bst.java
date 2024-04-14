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
    private int minDiff = Integer.MAX_VALUE;
    private TreeNode prevNode = null;

    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        return minDiff;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }

        traverse(node.left);

        if (prevNode != null) {
            minDiff = Math.min(minDiff, node.val - prevNode.val);
        }
        prevNode = node;

        traverse(node.right);
    }
}
