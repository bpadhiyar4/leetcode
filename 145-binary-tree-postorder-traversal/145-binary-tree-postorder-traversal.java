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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();    
        
        TreeNode curNode = root;
        
        // untill current node is not null.
        while(curNode != null) {
            
            // if current node's right is null, add the curNode val in list and shift curNode to curNode.left.
            if(curNode.right == null) {
                ans.add(curNode.val);
                curNode = curNode.left;
            } else {
                
                // create temporary between the left most node and curNode.
                
                // take preNode to the left most node.
                TreeNode preNode = curNode.right;
                while(preNode.left != null && preNode.left != curNode) {
                    preNode = preNode.left;
                }
                
                
                // if the preNode.left is null then create a temporary link between preNode.left and shift curNode to curNode.right.
                if(preNode.left == null) {
                    preNode.left = curNode;
                    ans.add(curNode.val);
                    curNode = curNode.right;
                } else {
                    // preNode.left is curNode. Here we will set null to the preNode.left and the preNode.val in list and shift curNode to curNode.left.
                    preNode.left = null;
                    curNode = curNode.left;
                }
            }
        }
        
        // Reversing the list.
        Collections.reverse(ans);
        
        return ans;
    }
}