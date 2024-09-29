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
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode copy = head;
        int len = 0;

        while (copy != null) {
            copy = copy.next;
            len++;
        }

        k = k % len;

        if (k == 0) {
            return head;
        }

        copy = head;
        for (int i=0; i< len - k; i++) {
            copy = copy.next;
        }

        ListNode curCopy = copy;
        while (curCopy.next != null) {
            curCopy = curCopy.next;
        }
        
        curCopy.next = head;
        // curCopy = copy;
        for (int i=0; i< len - k; i++) {
            curCopy = curCopy.next;
        }

        curCopy.next = null;
        return copy;
    }
}