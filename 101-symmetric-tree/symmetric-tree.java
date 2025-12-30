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

        if(root == null) return true;
        return isSame(root.left, root.right);
    }
    private boolean isSame(TreeNode left, TreeNode right){

        if(right == null && left == null) return true;
        if(right == null || left == null) return false;

        return (left.val == right.val) && isSame(left.left, right.right)
         && isSame(left.right, right.left);
    }   
    
        
}
