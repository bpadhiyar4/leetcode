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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> numbers = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            
            if(node == null) {
                continue;
            }
            
            if(numbers.contains(k - node.val)) {
                return true;
            }
            
            numbers.add(node.val);
            q.add(node.left);
            q.add(node.right);
        }
        
        return false;
    }
}