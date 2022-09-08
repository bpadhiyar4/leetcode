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
    public TreeNode bstFromPreorder(int[] preorder) {
        return createTree(preorder, 0, preorder.length-1);
    }
    
    private TreeNode createTree(int[] preOrder, int start, int end) {
        
        if(start > end) {
            return null;
        }
        
        TreeNode root = new TreeNode(preOrder[start]);
        
        int index = findIndex(preOrder, start, end);
        root.left = createTree(preOrder, start+1, index-1);
        root.right = createTree(preOrder, index, end);
        
        return root;
    }
    
    private int findIndex(int[] preOrder, int start, int end) {
        int ans = start;
        
        for(; ans<= end; ans++) {
            if(preOrder[ans] > preOrder[start]) {
                break;
            }
        }
        
        return ans;
    }
}