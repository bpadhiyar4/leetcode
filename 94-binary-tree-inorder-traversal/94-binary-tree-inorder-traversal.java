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
        
        // untill current node is not null.
        while(curNode != null) {
            
            // if current node's left is null, add the curNode val in list and set current node's right to curNode.
            if(curNode.left == null) {
                ans.add(curNode.val);
                curNode = curNode.right;
            } else {
                
                // create temporary between the right most node and curNode.
                
                // take preNode to the right most node.
                TreeNode preNode = curNode.left;
                while(preNode.right != null && preNode.right != curNode) {
                    preNode = preNode.right;
                }
                
                
                // if the preNode's right is null then create a temporary link between preNode's right and curNode.
                if(preNode.right == null) {
                    preNode.right = curNode;
                    curNode = curNode.left;
                } else {
                    
                    // preNode.right is curNode. Here we will set null to the preNode.right and and the preNode.val in list and shift curNode to curNode.right.
                    preNode.right = null;
                    ans.add(curNode.val);
                    curNode = curNode.right;
                }
            }
        }
        return ans;
    }
}