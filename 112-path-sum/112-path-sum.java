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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int[] sum = {0};
        return findSum(root, sum, targetSum);
    }
    
    private boolean findSum(TreeNode node, int[] sum, int target) {
        if(node == null) {
            return false;
        }
        
        sum[0] += node.val;
        
        if(node.left == null && node.right == null && sum[0] == target) {
            return true;
        }
        
        if(findSum(node.left, sum, target) || findSum(node.right, sum, target)) {
            return true;
        } else {
            sum[0] -= node.val;
            return false;
        }
    }
}