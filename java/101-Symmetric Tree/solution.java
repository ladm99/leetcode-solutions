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
        //boolean success = true;
        
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        return mirror(left, right);
        
    }
    
    public boolean mirror(TreeNode left, TreeNode right){
        if(left == null && right == null){return true;}
        if((left != null && right != null) && (left.val == right.val)){
            return (mirror(left.left, right.right) && (mirror(left.right, right.left)));
        }
        return false;
        
    }
}