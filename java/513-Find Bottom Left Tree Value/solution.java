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
    public int findBottomLeftValue(TreeNode root) {
        ArrayList <TreeNode> queue = new ArrayList<>();
        queue.add(root);   
        TreeNode cur = null;
        
        while(queue.size() != 0){
            int size = queue.size();
            cur = queue.get(0);
            for(int i = 0; i < size; i++){
                TreeNode temp = queue.remove(0);
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
        return  cur.val;
    }
}