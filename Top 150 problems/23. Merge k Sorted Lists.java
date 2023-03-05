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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<Integer>();
        ListNode head=null;
        for(int i=0;i<lists.length;i++)
        {
            while(lists[i]!=null)
            {
                list.add(lists[i].val);
                lists[i]=lists[i].next;
            }
        }
        Collections.sort(list);
            ListNode temp=null;
        for(int i=0;i<list.size();i++)
        {
            ListNode newNode=new ListNode(list.get(i));
            newNode.next=null;
          
            if(head==null)
            {
                head=newNode;
                temp=head;
            }
            else
            {
                temp.next=newNode;
                temp=temp.next;
            }
            
        }
        return head;
    }
}