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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        
        if(root.left != null) {
            q1.add(root.left);
        }
        
        if(root.right != null) {
            q2.add(root.right);
        }
        
        while(!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode n1 = q1.poll();
            TreeNode n2 = q2.poll();
            
            if(n1.val != n2.val) {
                return false;
            }
            
            if(n1.left == null && n2.right == null) {
            } else if(n1.left == null || n2.right == null) {
                return false;
            } else {
                q1.add(n1.left);
                q2.add(n2.right);
            }
            
            if(n1.right == null && n2.left == null) {
            } else if(n1.right == null || n2.left == null) {
                return false;
            } else {
                q1.add(n1.right);
                q2.add(n2.left);
            }
        }
        
        return q1.isEmpty() && q2.isEmpty();
    }
}