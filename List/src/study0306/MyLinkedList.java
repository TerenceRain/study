package study0306;

class LinkedListIndexIsNUllException extends RuntimeException{
    public LinkedListIndexIsNUllException(String message){
        super(message);
    }
}

class ListNode{
    int val;
    ListNode next = null;
    ListNode prev = null;
    public ListNode(int val){
        this.val = val;
    }
}
public class MyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length = 0;
    public MyLinkedList(){
        head = null;
        tail = null;
    }
    public int length(){
        return this.length;
    }

    public void addFirst(int val){//头插
        ListNode newListNode = new ListNode(val);
        if(head == null){//如果是空链表
            head = newListNode;
            tail = newListNode;
            length++;
            return ;
        }
        newListNode.next = head;
        head.prev = newListNode;
        head = newListNode;
        length++;
        return;

    }

    public void addLast(int val){
        ListNode newListNode = new ListNode(val);
        if(head == null){
            head = newListNode;
            tail = newListNode;
            length++;
            return;
        }
        tail.next = newListNode;
        newListNode.prev = tail;
        tail = tail.next;
        length++;
    }

    public void add(int index, int val){//指定位置插入
        if(index < 0 || index > length ){
            throw new LinkedListIndexIsNUllException("下标为空！");
        }
        if(head == null){//处理头插
            addFirst(val);
        }
        if (index == length){//处理尾插
            addLast(val);
        }
        ListNode newListNode = new ListNode(val);
        ListNode nextNode = getNode(index);

        ListNode prevNode = nextNode.prev;

        prevNode.next = newListNode;
        newListNode.prev = prevNode;

        newListNode.next = nextNode;
        nextNode.prev = newListNode;
        length++;

    }

    public void removeFirst(){//头删
        if (head == null){//链表为空
            return;
        }
        if (head.next == null){//只有一个元素
            head = null;
            tail = null;
            length = 0;
            return;

        }

        ListNode nextNode = head.next;//删除首节点
        nextNode.prev = null;
        head = nextNode;
        length--;
    }

    public void removeLast(){//尾删
        if (head == null){//链表为空
            return;
        }
        if (head.next == null){//只有一个元素
            head = null;
            tail = null;
            length = 0;
            return;

        }

        ListNode prevNode = tail.prev;
        prevNode.next = null;
        tail = prevNode;
        length--;
    }

    public void remove(int index){//按照给定元素删除
        if(index < 0 || index >= length ){
            throw new LinkedListIndexIsNUllException("下标为空！");
        }

        if(index == 0){
            removeFirst();
            return;
        }
        if (index == length - 1){
            removeLast();
            return;
        }
        //根据下标找到位置
        ListNode toRemove = getNode(index);
        //记录前后节点
        ListNode prevNode = toRemove.prev;
        ListNode nextNode = toRemove.next;
        //删除节点
        prevNode.next = prevNode;
        nextNode.prev = prevNode;
        length--;
    }

    public void removeByValue(int val){
        int index = indexOf(val);
        if(index == -1){
            return;
        }
        remove(index);

    }

    public int get(int index){//根据下标查找节点的值
        if(index < 0 || index >= length ){
            throw new LinkedListIndexIsNUllException("下标为空！");
        }
        return getNode(index).val;
    }

    public void  set(int index, int value){//更改给定下标的节点的值
        if(index < 0 || index >= length ){
            throw new LinkedListIndexIsNUllException("下标为空！");
        }
        ListNode node = getNode(index);
        node.val = value;
    }

    public int indexOf(int value) {//获得指定值的下标
        ListNode cur = head;
        for (int i = 0; i < length; i++) {
            if(cur.val == value){
                return i;
            }
            cur = cur.next;
        }
        return -1;
    }

    public ListNode  getNode(int index) {//根据下标找到节点
        if (index < 0 || index >= length){
            throw new LinkedListIndexIsNUllException("下标为空！");

        }
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }


}
