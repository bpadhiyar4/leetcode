/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node curNode = head;

        while (curNode != null) {
            Node newNode = new Node(curNode.val);
            newNode.next = curNode.next;
            curNode.next = newNode;
            curNode = newNode.next;
        }

        curNode = head;
        while (curNode != null) {
            if (curNode.random != null) {
                curNode.next.random = curNode.random.next;
            }

            curNode = curNode.next != null ? curNode.next.next : null;
        }

        Node oldHead = head;
        Node newHead = head.next;
        Node curOld = oldHead;
        Node curNew = newHead;

        while (curOld != null) {
            curOld.next = curOld.next.next;
            curNew.next = curNew.next != null ? curNew.next.next : null;
            curOld = curOld.next;
            curNew = curNew.next;
        }

        return newHead;
    }
}