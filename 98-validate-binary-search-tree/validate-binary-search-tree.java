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
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         if(root == null) return true;

//     // check largest vlue in left subtree 
//         if(root.left != null){

//             TreeNode temp = root.left;
//             while(temp.right != null) temp  = temp.right;

//            if(temp.val >= root.val) return false;

//         }

//         // check smmlest vlue in right subtree

//         if(root.right != null){

//             TreeNode temp = root.right;
//             while(temp.left != null) temp = temp.left;

//             if(temp.val <= root.val) return false;

//         }
//         return isValidBST(root.left) && isValidBST(root.right);
//     }
// }

class Solution{
    public boolean isValidBST(TreeNode root){

        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean  helper(TreeNode root, long min, long max){
        if(root == null) return true;

        if(root.val <= min || root.val >= max) return false;

        boolean left = helper(root.left, min, root.val);
        boolean right = helper(root.right, root.val, max);

        return left && right;
    }
}