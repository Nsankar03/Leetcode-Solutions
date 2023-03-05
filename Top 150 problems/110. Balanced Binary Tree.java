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
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;        
        height(root);
        return flag;
        
    }
    public int height(TreeNode root)
    {
        if(root==null)return 0;
        
        int l=height(root.left);
        int r=height(root.right);
        int max=Math.max(l,r)+1;
        if(Math.abs(l-r)>1)
        {
            flag=false;
        }
        
        return max;
    }
}