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
        ListNode curHead = head;
        ListNode beforeRemove = null;
        
        int itr = 1;
        
        while(itr <= n) {
            curHead = curHead.next;
            itr++;
        }
        
        if(curHead == null) {
            return head.next;
        }
        
        beforeRemove = head;
        
        while(curHead.next != null) {
            curHead = curHead.next;
            beforeRemove = beforeRemove.next;
        }
        
        if(beforeRemove != null && beforeRemove.next != null) {
            beforeRemove.next = beforeRemove.next.next;
        }
        
        return head;
    }
}