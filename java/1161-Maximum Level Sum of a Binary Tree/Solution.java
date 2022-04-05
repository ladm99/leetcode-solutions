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
    public int maxLevelSum(TreeNode root) {
        int level = 1;
        int maxLevel = 1;
        int maxSum = root.val;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        while(!q.isEmpty()){
            int sum = 0;
            int n = q.size();
            
            for(int i = 0; i < n; i++){
                TreeNode current = q.poll();
                sum+=current.val;
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }

            }
            
            if(sum > maxSum){
                maxSum = sum;
                maxLevel = level;
            }
            
            level++;
        }
        
        return maxLevel;
    }
}