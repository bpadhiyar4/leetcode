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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return depth(root, 0);
    }

    private int depth(TreeNode root, int curLength) {
        if (root == null) {
            return curLength;
        }

        return Math.max(depth(root.left, curLength + 1), depth(root.right, curLength + 1));
    }
}