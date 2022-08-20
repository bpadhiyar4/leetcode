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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();    
        travel(root, ans);
        return ans;
    }
    
    private void travel(TreeNode root, List<Integer> preOrder) {
        if(root != null) {
            travel(root.left, preOrder);
            preOrder.add(root.val);
            travel(root.right, preOrder);
        }
    }
}