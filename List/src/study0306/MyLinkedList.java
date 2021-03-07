package study0306;

class LinkedListIndexIsNUllException extends RuntimeException{
    public LinkedListIndexIsNUllException(String message){
        super(message);
    }
}

class MyLinkedNode {
    int val;
    MyLinkedNode next = null;
    MyLinkedNode prev = null;
    public MyLinkedNode(int val){
        this.val = val;
    }

    @Override
    public String toString(){
        return "[" + val + "]";
    }
}
public class MyLinkedList {
    private MyLinkedNode head;
    private MyLinkedNode tail;
    private int length = 0;
    public MyLinkedList(){
        head = null;
        tail = null;
    }
    public int length(){
        return this.length;
    }

    public void addFirst(int val){//头插
        MyLinkedNode newMyLinkedNode = new MyLinkedNode(val);
        if(head == null){//如果是空链表
            head = newMyLinkedNode;
            tail = newMyLinkedNode;
            length++;
            return ;
        }
        newMyLinkedNode.next = head;
        head.prev = newMyLinkedNode;
        head = newMyLinkedNode;
        length++;
        return;

    }

    public void addLast(int val){
        MyLinkedNode newMyLinkedNode = new MyLinkedNode(val);
        if(head == null){
            head = newMyLinkedNode;
            tail = newMyLinkedNode;
            length++;
            return;
        }
        tail.next = newMyLinkedNode;
        newMyLinkedNode.prev = tail;
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
        MyLinkedNode newMyLinkedNode = new MyLinkedNode(val);
        MyLinkedNode nextNode = getNode(index);

        MyLinkedNode prevNode = nextNode.prev;

        prevNode.next = newMyLinkedNode;
        newMyLinkedNode.prev = prevNode;

        newMyLinkedNode.next = nextNode;
        nextNode.prev = newMyLinkedNode;
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

        MyLinkedNode nextNode = head.next;//删除首节点
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

        MyLinkedNode prevNode = tail.prev;
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
        MyLinkedNode toRemove = getNode(index);
        //记录前后节点
        MyLinkedNode prevNode = toRemove.prev;
        MyLinkedNode nextNode = toRemove.next;
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
        MyLinkedNode node = getNode(index);
        node.val = value;
    }

    public int indexOf(int value) {//获得指定值的下标
        MyLinkedNode cur = head;
        for (int i = 0; i < length; i++) {
            if(cur.val == value){
                return i;
            }
            cur = cur.next;
        }
        return -1;
    }

    public MyLinkedNode getNode(int index) {//根据下标找到节点
        if (index < 0 || index >= length){
            throw new LinkedListIndexIsNUllException("下标为空！");

        }
        MyLinkedNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }


}
