package lesson1;

public class MyBlockingQueue<E> {
    private Object[] elements;
    private int putIndex;//存放元素的索引
    private int takeIndex;//取元素的索引
    private int size;//存放元素的数量
    public MyBlockingQueue(int capacity){
        elements = new Object[capacity];
    }

//    线程安全的存放元素；如果超过最大容量需要等待，否则存放
    public synchronized void put(E e){
        try {
            while (size == elements.length){
                wait();
            }
            elements[putIndex] = e;
            putIndex = (putIndex + 1) % elements.length;
            size++;
            notifyAll();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

//    线程安全的取元素；如果队列中没有元素，需要等待，否则就可以取
    public synchronized E take() throws InterruptedException {
        while (size == 0){
            wait();
        }
        E e = (E) elements[takeIndex];
        takeIndex = (takeIndex + 1) % elements.length;
        size--;
        notifyAll();
        return e;
    }
    public static void main(String[] args) {
        final MyBlockingQueue<String> queue = new MyBlockingQueue<String>(10);
        new Thread(new Runnable() {
            public void run() {
                queue.put("");
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                try {
                    String s = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
