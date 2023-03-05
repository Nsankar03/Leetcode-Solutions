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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        ListNode newNode=head;
        ListNode n=head;
        int count=0;
        while(newNode!=null)
        {
            count++;
            newNode=newNode.next;
        }
        int c=0;
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next=head;
        ListNode nNode=head;
        int K=k%count;
        while(c<(count-K-1))
        {
            c++;
            nNode=nNode.next;
        }
        ListNode a=nNode.next;
        nNode.next=null;
        return a;
    }
}