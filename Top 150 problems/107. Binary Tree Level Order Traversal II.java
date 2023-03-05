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
    public List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> arr=new ArrayList<>();
            int l=q.size();
            for(int i=0;i<l;i++)
            {
                TreeNode r=q.poll();
                arr.add(r.val);
                if(r.left!=null)
                q.add(r.left);
                if(r.right!=null)
                q.add(r.right);
            }
            list.add(arr);
        }
       Collections.reverse(list);
       return list;
    }
}