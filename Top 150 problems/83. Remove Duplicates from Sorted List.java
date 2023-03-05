/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;Node next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}