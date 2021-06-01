package lesson1;

public class NewThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("abc");
            }
        };
//        start是真正启动一个线程，
//        和调用start方法所在的一个线程（main）
//        是并发并行执行
        thread.start();

//        run这里是在main线程中的一个方法调用
        thread.sleep(10000);
        thread.run();
    }
}
