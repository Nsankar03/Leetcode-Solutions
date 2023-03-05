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
    public ListNode sortList(ListNode head) {
         List<Integer> list=new ArrayList<Integer>();
        ListNode n=head;
        while(n!=null)
        {
            list.add(n.val);
            n=n.next;
        }
        Collections.sort(list);
        ListNode newNode=null;
        ListNode temp=null;
         for(int i=0;i<list.size();i++)
        {      
            
               ListNode tmp=new ListNode(list.get(i));  
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
        return temp;
    }
}