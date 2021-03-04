package Study0303;
class InputNullException extends RuntimeException{
    public InputNullException(String message){
        super(message);
        System.out.println("输入的值比链表长度大了！");
    }
}
class Node{//定义节点
    int data;
    Node next;
    public Node(int val){
        this.data = val;
        this.next = null;
    }
    @Override
    public String toString(){
        return  "[" + data + "]";
    }
}
public class ListApply {
    public static void main(String[] args) {
        //手动向链表中插入数据
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        Node head = node1;

//        print(head);//调用打印函数
//        System.out.println(findLastNode(head));
//        System.out.println(findPenultimateNode(head));
//        System.out.println(findNstNode(head, 1));
//        System.out.println(calculateSize(head));
        System.out.println(contains(head, 9));
    }

    private static boolean contains(Node head, int n) {
        Node cur = head;
        while(cur != null){
            if (cur.data == n){
                return true;
            }
            cur = cur.next;
 
        }
        return false;
    }

    private static int calculateSize(Node head) {
        Node cur = head;
        int size = 0;
        while(cur != null){
            size++;
            cur = cur.next;

        }
        return size;
    }

    private static Node findNstNode(Node head, int n) {
        Node cur = head;
        if (head == null || n <= 0){
            return null;
        }
        for (int i = 1; i < n; i++) {
            cur = cur.next;
        }
        return cur;
    }

    private static Node findPenultimateNode(Node head) {
        Node cur = head;
        while (cur.next.next != null){
            cur = cur.next;
        }
        return cur;
    }

    private static Node findLastNode(Node head) {
       Node cur = head;
       while (cur.next != null){
           cur = cur.next;
       }
       return cur;
    }

    private static void print(Node head) {
        Node cur = head;
        while(cur != null){
            System.out.println(cur);
            cur = cur.next;
        }
    }

}
