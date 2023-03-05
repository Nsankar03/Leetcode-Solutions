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
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        return height(root);
    }
    public int height(TreeNode root)
    {
        if(root==null)return 0;
         if (root.left != null && root.right != null)
        return Math.min(height(root.left), height(root.right))+1;
        else
        return Math.max(height(root.left), height(root.right))+1;
    }
}
/*f (root == null)
        return 0;
    if (root.left != null && root.right != null)
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    else
        return Math.max(minDepth(root.left), minDepth(root.right))+1;*/