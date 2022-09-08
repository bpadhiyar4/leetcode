/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        
        if(lengthA > lengthB) {
            return getIntersectionNode(lengthA - lengthB, headA, headB);
        } else {
            return getIntersectionNode(lengthB - lengthA, headB, headA);
        }
    }
    
    private ListNode getIntersectionNode(int diff, ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        
        for(int i=0;i<diff;i++) {
            currentA = currentA.next;
        }
        
        while(currentA != null) {
            if(currentA == currentB) {
                return currentA;
            }
            
            currentA = currentA.next;
            currentB = currentB.next;
        }
        
        return null;
    }
    
    private int getLength(ListNode head) {
        int length = 0;
        
        while(head != null) {
            length++;
            head = head.next;
        }
        
        return length;
    }
}