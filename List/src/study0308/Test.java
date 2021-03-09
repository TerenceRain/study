package study0308;

import sun.misc.Queue;

import java.util.Stack;

public class Test {

//    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<>();
//        s.push(10);
//        s.push(15);
//        s.push(20);
//        System.out.println(s.pop());
//        System.out.println(s.peek());
//    }

    public static void main(String[] args) throws InterruptedException {
        Queue <Integer> q = new Queue<>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }
}
