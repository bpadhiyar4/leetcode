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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ansNode = new ListNode();
        ListNode curNode = ansNode;
        ListNode nextNode = head;
        
        while(nextNode != null) {
            if(nextNode.val == val) {
                nextNode = nextNode.next;
            } else {
                curNode.next = new ListNode(nextNode.val);
                curNode = curNode.next;
                nextNode = nextNode.next;
            }
        }
        
        return ansNode.next;
    }
}