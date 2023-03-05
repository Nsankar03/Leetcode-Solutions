/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list=new ArrayList<Integer>();
        ListNode n=head;
        while(n!=null)
        {
            list.add(n.val);
            n=n.next;
        }
        ListNode newNode=null;
        ListNode temp=null;
        int len=list.size()-(list.size()%k);
        for(int i=k-1;i<len;i+=k)
        {      
            for(int j=i;j>i-k;j--)
            {
                ListNode tmp=new ListNode(list.get(j));
                if(newNode==null)
                {
                    newNode=tmp;
                    temp=newNode;
                }
                else
                {
                    newNode.next=tmp;
                    newNode=newNode.next;
                }
            }
        }
        for(int i=len;i<list.size();i++)
        {
             ListNode tmp=new ListNode(list.get(i));
             newNode.next=tmp;
             newNode=newNode.next;
        }
        return temp;
    }
}