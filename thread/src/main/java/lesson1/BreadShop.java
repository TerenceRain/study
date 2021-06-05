package lesson1;
//面包店：
//1.生产者（面包师傅-线程）：5个师傅，每个每次生产三个
//2.消费者（线程）：10个，每个每次消费一个
//库存（共享变量）：下限0，上限100
public class BreadShop {
//    库存
    private static int COUNT;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {//面包师傅

                public void run() {
                    try {
                        while(true){
                            //不停地生产面包
                            synchronized (BreadShop.class){
                                while(COUNT + 3 > 100){//等待的条件不用if
                                    BreadShop.class.wait();

                                }
                                COUNT += 3;
                                BreadShop.class.notifyAll();//通知所有线程
                                System.out.println(Thread.currentThread().getName() + "生产面包,库存 " + COUNT);
                            }
                            Thread.sleep(500);

                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"面包师傅[" + i +"]").start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {//消费者

                public void run() {
                    try {
                        while(true){
                            //不停地消费面包
                            synchronized (BreadShop.class){
                                while(COUNT == 0){
                                    BreadShop.class.wait();

                                }
                                COUNT --;
                                BreadShop.class.notifyAll();
                                System.out.println(Thread.currentThread().getName() + "消费了面包，库存" + COUNT);
                            }
                            Thread.sleep(500);

                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"消费者[" + i +"]").start();
        }
    }
}

