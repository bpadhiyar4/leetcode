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
        TreeNode curNode = root;
        
        while(curNode != null) {
            if(curNode.left == null) {
                ans.add(curNode.val);
                curNode = curNode.right;
            } else {
                TreeNode preNode = curNode.left;
                while(preNode.right != null && preNode.right != curNode) {
                    preNode = preNode.right;
                }
                
                if(preNode.right == null) {
                    preNode.right = curNode;
                    curNode = curNode.left;
                } else {
                    preNode.right = null;
                    ans.add(curNode.val);
                    curNode = curNode.right;
                }
            }
        }
        return ans;
    }
}