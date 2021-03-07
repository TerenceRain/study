package study0306;

import study0306.*;
public class Test {


    public static void main(String[] args) {
        MyLinkedNode myLinkedNode1 = new MyLinkedNode(0);
        MyLinkedNode myLinkedNode2 = new MyLinkedNode(1);
        MyLinkedNode myLinkedNode3 = new MyLinkedNode(2);
        MyLinkedNode myLinkedNode4 = new MyLinkedNode(3);
        MyLinkedNode myLinkedNode5 = new MyLinkedNode(4);

        myLinkedNode1.next = myLinkedNode2;
        myLinkedNode1.prev = null;
        myLinkedNode2.next = myLinkedNode3;
        myLinkedNode2.prev = myLinkedNode1;
        myLinkedNode3.next = myLinkedNode4;
        myLinkedNode3.prev = myLinkedNode2;
        myLinkedNode4.next = myLinkedNode5;
        myLinkedNode4.prev = myLinkedNode3;
        myLinkedNode5.next = null;
        myLinkedNode5.prev = myLinkedNode4;

        MyLinkedNode head = myLinkedNode1;

        MyLinkedList myLinkedList = new MyLinkedList();
         myLinkedList.addLast(100);
        for (; head != null; head = head.next) {
            System.out.println(head);
        }


    }



}
