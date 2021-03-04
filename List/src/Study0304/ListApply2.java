package Study0304;
class ListIsNullException extends RuntimeException{
    public ListIsNullException(String message){
        super(message);

    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    @Override
    public String toString(){
        return "[" + data + "]";
    }
}
public class ListApply2 {
    public static void main(String[] args) {
        //手动向链表中插入数据
        Node n1 = new Node(1);
        n1.next = null;
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        Node head = n1;

        head = pushFront(head, 10);
        head = popFront(head, 12);
        head = pushBack(head);
        head = popBack(head);
        while (head != null){
            System.out.println(head);
            head = head.next;
        }


}

    private static Node popBack(Node head) {//尾删
        if (head == null){
            throw new ListIsNullException("链表为空！");
        }
        if (head.next == null){
            head = null;
        }else{
            Node last2 = head;
            while(last2.next.next != null){
                last2 = last2.next;
            }
            last2.next = null;
        }

        return head;
    }

    private static Node pushBack(Node head) {//头删
        if (head == null){
            throw new ListIsNullException("链表为空！");
        }
        head = head.next;
        return head;
    }

    private static Node popFront(Node head, int i) {//尾插
        if (head == null){
            Node newNode = new Node(i);
            return newNode;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        Node newNode = new Node(i);
        lastNode.next = newNode;
        newNode.next = null;
        return head;
    }

    private static Node pushFront(Node head, int i) {//头插
        Node newNode = new  Node(i);
        newNode.next = head;
        head = newNode;
        return head;
    }
}
