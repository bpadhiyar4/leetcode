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

        Map<Node, Node> mapNode = new HashMap<>();

        Node cur = head;
        while(cur != null) {
            mapNode.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while(cur != null) {
            mapNode.get(cur).next = mapNode.get(cur.next);
            mapNode.get(cur).random = mapNode.get(cur.random);
            cur = cur.next;
        }

        return mapNode.get(head);
    }
}