/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> pPath = new Stack<>();
        Stack<TreeNode> qPath = new Stack<>();

        findNodePath(root, p, pPath);
        findNodePath(root, q, qPath);
        
        Stack<TreeNode> min = pPath;
        Stack<TreeNode> max = qPath;
        if (pPath.size() > qPath.size()) {
            min = qPath;
            max = pPath;
        }

        while(max.size() > min.size()) {
            if (min.peek() == max.peek()) {
                return max.peek();
            }

            max.pop();
        }

        while(min.size() > 0 && min.peek() != max.peek()) {
            min.pop();
            max.pop();
        }

        return max.peek();
    }

    public boolean findNodePath(TreeNode root, TreeNode node, Stack<TreeNode> path) {
        if (root == null) {
            return false;
        }

        path.push(root);
        if (root == node) {
            return true;
        }

        if (findNodePath(root.left, node, path)) {
            return true;
        }

        if (findNodePath(root.right, node, path)) {
            return true;
        }

        if (!path.isEmpty()) {
            path.pop();
        }

        return false;
    }
}