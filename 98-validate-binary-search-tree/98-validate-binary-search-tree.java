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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        
        travel(root, inOrder);
        
        int len = inOrder.size();
        
        int i=0;
        
        while(i< len-1) {
            int cur = inOrder.get(i);
            int next = inOrder.get(i+1);
            
            if(cur >= next) {
                return false;
            }
            
            i++;
        }
        
        return true;
    }
    
    private void travel(TreeNode root, List<Integer> inOrder) {
        if(root != null) {
            travel(root.left, inOrder);
            inOrder.add(root.val);
            travel(root.right, inOrder);
        }
    }
}