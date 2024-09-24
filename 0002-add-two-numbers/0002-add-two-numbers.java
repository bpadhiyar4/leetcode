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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int div = 0;

        ListNode head = new ListNode();
        ListNode ans = head;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + div;
            int rem = sum % 10;
            div = sum / 10;
            ans.next = new ListNode(rem);
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = div + l1.val;
            int rem = sum % 10;
            div = sum / 10;
            ans.next = new ListNode(rem);
            ans = ans.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = div + l2.val;
            int rem = sum % 10;
            div = sum / 10;
            ans.next = new ListNode(rem);
            ans = ans.next;
            l2 = l2.next;
        }

        if (div != 0) {
            ans.next = new ListNode(div);
        }

        return head.next;
    }
}