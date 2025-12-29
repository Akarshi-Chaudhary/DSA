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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>res = new ArrayList<>();
        rcrsive(root, res);
        return res;
    }
    public  void rcrsive(TreeNode root, ArrayList<Integer>res){
        if(root == null) return;
            res.add(root.val);
            rcrsive(root.left,res);
            rcrsive(root.right,res);
    }
}
// class Solution{
//     ArrayList<Integer>res = new ArrayList<>();
//     public List<Integer> preorderTraversal(TreeNode root){
//         if(root == null)
//             return res;
//         res.add(root.val);
//         preorderTraversal(root.left);
//         preorderTraversal(root.right);
//         return res;
//     }
//     public void chnce(TreeNode root, ArrayList<Integer>res){
//     }
// }