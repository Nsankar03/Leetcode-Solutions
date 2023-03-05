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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newNode=new ListNode(0,head);
        ListNode n=newNode;
        while(head!=null)
        {
            if(head.next!=null && head.val==head.next.val)
            {
                while(head.next!=null && head.val==head.next.val)
                {
                    head=head.next;
                }
                n.next=head.next;
            }
            else
            {
                n=n.next;
            }
            head=head.next;
        }
        return newNode.next;
    }
}