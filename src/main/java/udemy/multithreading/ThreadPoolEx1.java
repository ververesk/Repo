package udemy.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp());
        }
        executorService.shutdown(); //надо обязательно это писать иначе программа не закончится
        executorService.awaitTermination(5, TimeUnit.SECONDS);//поток main будет ждать либо пока executorService не закончит работу либо пока не пройдет 5 секунд
        //вызывается всегда после shutdown
        System.out.println("main ends");
    }
}

class RunnableImp implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
