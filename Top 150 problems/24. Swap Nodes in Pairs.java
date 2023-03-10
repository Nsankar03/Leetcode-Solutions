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
    public ListNode swapPairs(ListNode head) {
       
        if (head==null || head.next==null)return head; 
        
       
        ListNode temp=head.next;
        head.next=head.next.next; 
        temp.next=head; 
        head=temp;

       
        ListNode curr=head.next; 
        while(curr.next!=null && curr.next.next!=null){
            temp=curr.next;
            curr.next=curr.next.next;
            temp.next=temp.next.next;
            curr.next.next=temp;
            curr=curr.next.next;
        }
        
        return head;
    }  
}

