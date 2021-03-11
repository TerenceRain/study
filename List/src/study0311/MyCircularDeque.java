package study0311;

class MyCircularDeque {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    int capacity;
    Node head ;
    Node tail ;
    int size = 0;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        capacity  = k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        Node node = new Node(value);
        if(size >= capacity){
            return false;
        }
        if (head == null){
            head = node;
            tail = node;
            size++;
            return true;
        }
        node.next = head;
        head = head.next;
        size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        Node node = new Node(value);
        if (size >= capacity){
            return false;
        }
        if (head == null){
            head = node;
            tail = node;
            size++;
            return true;
        }
        tail.next = node;
        tail = node;
        size++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {

        if (head == null){
            return false;
        }

        if (head.next == null){
            head = null;
            size--;
            return true;
        }
        head = head.next;
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (head == null){
            return false;
        }
        if (head.next == null){
            head = null;
            size--;
            return true;
        }
        tail = tail.next;
        size--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        return head == null ? -1 :head.val;

    }

    /** Get the last item from the deque. */
    public int getRear() {
        return tail == null ? -1 : tail.val;

    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == capacity;
    }
}