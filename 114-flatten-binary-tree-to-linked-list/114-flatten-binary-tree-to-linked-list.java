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
    public void flatten(TreeNode root) {
        TreeNode curNode = root;
        
        while(curNode != null) {
            if(curNode.left != null) {
                TreeNode prev = curNode.left;
                
                while(prev.right != null) {
                    prev = prev.right;
                }
                
                prev.right = curNode.right;
                curNode.right = curNode.left;
                curNode.left = null;
            }
            
            curNode = curNode.right;
        }
    }
}