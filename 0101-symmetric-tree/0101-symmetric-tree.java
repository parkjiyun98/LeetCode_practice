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
        if(root == null) return false;
        
        return symmetric(root.left, root.right);
    }
    
    public boolean symmetric(TreeNode leftParent, TreeNode rightParent) {
        
        if(leftParent == null && rightParent == null) return true;
        if(leftParent == null || rightParent == null) return false;
        if(leftParent.val != rightParent.val) return false;
        
        return symmetric(leftParent.left, rightParent.right) && 
                 symmetric(leftParent.right, rightParent.left);
    }
}
        
