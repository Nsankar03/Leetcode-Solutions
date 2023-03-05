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
    public boolean hasPathSum(TreeNode root, int t) {
        List<Integer> str=new ArrayList<Integer>();
        if(root!=null)
        {
           formPath(root,0,str);
        }
        System.out.print(str);
        if(str.contains(t))
        {
        return true;
        }
        return false;
    }
    public void formPath(TreeNode root,int val,List<Integer> str)
    {
        if(root.left==null && root.left==null) 
        {
            if(str.size()>1)
            str.add(val+root.val);            
        }
        if(root.left!=null)formPath(root.left,val+root.val,str);
        if(root.right!=null)formPath(root.right,val+root.val,str);
    }
   
}
  