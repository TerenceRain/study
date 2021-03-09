package study0308;
class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}
public class MyStack2 {
    Node head = null;
    public void push(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode ;
            return;
        }
        newNode.next  =head;
        head = newNode;
    }

    public Integer pop(){
        if (head == null){
            return null;
        }
        if (head.next == null){
         int ret = head.val;
         head = null;
         return ret;
        }

        int ret = head.val;
        head = head.next;
        return ret;
    }

    public Integer peek(){
        if (head == null){
            return  null;
        }

        return head.val;
    }
}
