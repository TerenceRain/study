package lesson1;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
//        快捷方式创建线程池
//        单线程池，只有一个线程运行任务
        ExecutorService single = Executors.newSingleThreadExecutor();
//        固定大小的线程池；固定数量的线程执行任务
        ExecutorService fixed = Executors.newFixedThreadPool(4);
//        缓存的线程池
        ExecutorService cached = Executors.newCachedThreadPool();
//        定时任务的线程池
        ExecutorService scheduled = Executors.newScheduledThreadPool(100);

//        真实使用线程池的API
        ExecutorService pool = new ThreadPoolExecutor(
                4,//核心线程数
                10,//最大线程数
                60,//空闲时间数量
                TimeUnit.SECONDS,//空闲时间单位
                new LinkedBlockingQueue<Runnable>(),//阻塞队列
                new ThreadFactory() {
                    public Thread newThread(Runnable r) {
                        return new Thread(r);
                    }
                },
//                new ThreadPoolExecutor.CallerRunsPolicy()
//                new ThreadPoolExecutor.AbortPolicy()
//                new ThreadPoolExecutor.DiscardOldestPolicy()
                new ThreadPoolExecutor.DiscardPolicy()
        );
        pool.execute(new Runnable() {
            public void run() {
                System.out.println(1);
            }
        });
    }
}
