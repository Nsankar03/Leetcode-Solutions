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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        recurse(root);
        return ans;
    }
    
    public int recurse(TreeNode root) {
        if(root == null) return 0;
        int left = recurse(root.left); 
        int right = recurse(root.right);
        if(left < 0) left = 0;
        if(right < 0) right = 0;
        int sum = root.val + left + right;
        ans = Math.max(sum, ans);
        return Math.max(left + root.val, right + root.val);
    }
}