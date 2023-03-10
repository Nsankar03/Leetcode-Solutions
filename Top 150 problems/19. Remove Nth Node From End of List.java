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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode head1 = head;
        ListNode post = head;
        for(int i = 0; i<n && post != null; i++){
            post = post.next;
        }
        while(post != null && post.next != null){
            head = head.next;
            post=post.next;
            
        }
        if(post == null) return head.next;
        else {
            head.next = head.next.next;
        }
        return head1;
    }
}