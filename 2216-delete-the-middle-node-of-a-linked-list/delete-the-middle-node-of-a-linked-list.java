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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode dummy=null;

        if(fast.next==null){
            return head.next;
        }
        if(head.next==null){
            return head;
        }

        while(fast!=null && fast.next!=null){
            
            dummy=slow;
            slow=slow.next;
            fast=fast.next.next;
            
        }
        if(dummy!=null){
             dummy.next=slow.next;

        }
    
        return head ;
    }
}