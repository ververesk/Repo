package udemy.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
   // static int counter = 0;
    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
 //       counter++;
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread th1  =new Thread(new MyRunnableImp18());
        Thread th2  =new Thread(new MyRunnableImp18());
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(counter);
    }
}

class MyRunnableImp18 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerEx.increment();
        }
    }
}
