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
        int len = 1;

        while (copy.next != null) {
            copy = copy.next;
            len++;
        }

        k = k % len;
        if (k == 0) {
            return head;
        }

        k = len - k;
        copy.next = head;
        while (k-- > 0) {
            copy = copy.next;
        } 

        head = copy.next;
        copy.next = null;
        return head;
    }
}