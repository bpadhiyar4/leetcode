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
        int carry = 0;

        ListNode head = new ListNode();
        ListNode ans = head;
        while(l1 != null || l2 != null || carry != 0) {
            int val_1 = l1 == null ? 0 : l1.val;
            int val_2 = l2 == null ? 0 : l2.val;
            int sum = val_1 + val_2 + carry;
            int rem = sum % 10;
            carry = sum / 10;
            ans.next = new ListNode(rem);
            ans = ans.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return head.next;
    }
}