/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)return null;
        ListNode f=head;
        ListNode s=head;
        ListNode e=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
            if(f==s)
            {
                while(e!=s)
                {
                    e=e.next;
                    s=s.next;
                }
                return e;
            }
        }
        return null;
    }
}