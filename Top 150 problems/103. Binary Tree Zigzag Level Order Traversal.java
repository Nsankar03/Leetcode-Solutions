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
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)return list;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        int level=0;
        while(!q.isEmpty())
        {
             ArrayList<Integer> sub = new ArrayList<>();
            int l=q.size();
            for(int i=0;i<l;i++)
            {
                TreeNode r=q.poll();
                 sub.add(r.val);
                    if(r.left!=null)q.add(r.left);
                    if(r.right!=null)q.add(r.right);
                
            }
            if (level % 2 != 0)     Collections.reverse(sub);
            list.add(sub);
            level++;
        }
        return list;
    }
}