class Node {
    int val;
    int key;
    Node next;
    Node prev;
    Node(int key, int val, Node prev, Node next) {
        this.key = key;
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

class LRULinkedList {
    Node head;
    Node tail;

    void addToHead(Node node) {
        if (head != null) {
            node.next = head;
            head.prev = node;
        }

        if (tail == null) {
            tail = node;
        }

        head = node;
    }

    void unlink(Node node) {
        if (node == null) {
            return;
        }

        Node prevNode = node.prev;
        Node nextNode = node.next;

        if (prevNode != null) {
            prevNode.next = nextNode;
        }
        
        if (nextNode != null) {
            nextNode.prev = prevNode;
        }

        if (node == head) {
            head = nextNode;
        }

        if (node == tail) {
            tail = prevNode;
        }

        node.prev = null;
        node.next = null;
    }
}

class LRUCache {
    int capacity;
    Map<Integer, Node> map;
    LRULinkedList lruLinkedList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.lruLinkedList = new LRULinkedList();
        this.map = new HashMap<>();
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        
        Node node = map.get(key);
        lruLinkedList.unlink(node);
        lruLinkedList.addToHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        Node newNode = new Node(key, value, null, null);
        if (map.containsKey(key)) {
            remove(map.get(key));
        }

        if (map.size() == this.capacity) {
            evict();    
        }

        this.lruLinkedList.addToHead(newNode);
        map.put(key, newNode);
    }

    private void evict() {
        Node tail = this.lruLinkedList.tail;
        if (tail != null) {
            remove(tail);
        }
    }

    private void remove(Node node) {
        this.lruLinkedList.unlink(node);
        map.remove(node.key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */