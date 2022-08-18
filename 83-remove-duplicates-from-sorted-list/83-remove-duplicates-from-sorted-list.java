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
        
        if(head == null) {
            return null;
        }
        
        ListNode copy = head;
        ListNode sorted = new ListNode();
        ListNode curNode = sorted;
        
        while(head != null) {
            if(head.val == curNode.val) {
                head = head.next;
            } else {
                curNode.next = new ListNode(head.val);
                curNode = curNode.next;
                head = head.next;
            }
        }
        
        return (copy.val == 0) ? sorted : sorted.next;
    }
}