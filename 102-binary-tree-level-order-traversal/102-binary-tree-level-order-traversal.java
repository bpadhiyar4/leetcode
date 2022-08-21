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
    public List<List<Integer>> levelOrder(TreeNode root) {
        int h = height(root);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<h;i++) {
            ans.add(new ArrayList<>());
        }
        
        travelLevel(root, 0, h, ans);
        
        return ans;
    }
    
    private void travelLevel(TreeNode root, int level, int height, List<List<Integer>> order) {
        if(level < height && root != null) {
            order.get(level).add(root.val);
            travelLevel(root.left, level+1, height, order);
            travelLevel(root.right, level+1, height, order);
        }
    }
    
    private int height(TreeNode root) {
        if(root ==null) {
            return 0;
        }
        
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        
        return lHeight > rHeight ? lHeight +1 : rHeight + 1;
    }
}