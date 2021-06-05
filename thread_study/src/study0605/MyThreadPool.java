package study0605;

public class MyThreadPool {
    private MyBlockingQueue<Runnable> queue = new MyBlockingQueue<>(1000);
    public MyThreadPool(int coreSize){
        for (int i = 0; i < coreSize; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while(true){
                            Runnable task = queue.take();
                            task.run();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public void execute(Runnable task){
        try {
            queue.put(task);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        MyThreadPool pool = new MyThreadPool(4);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    pool.execute(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(1);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                    });
                }
            }).start();
        }

//        pool.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        });

    }
}
