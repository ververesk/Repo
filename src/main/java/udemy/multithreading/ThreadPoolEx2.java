package udemy.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new udemy.multithreading.RunnableImp100());
//        }
//        scheduledExecutorService.schedule(new udemy.multithreading.RunnableImp100(),
//                3, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(new RunnableImp100(),
                3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool(); //создает новые потоки по надобности
    }
}

class RunnableImp100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
