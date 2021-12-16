package udemy.multithreading.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayBlockingQueueEx2 {
    public static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        //producer
        new Thread(() -> {
            int i = 0;
            while (atomicInteger.get()<10) {
                atomicInteger.incrementAndGet();
                System.out.println(atomicInteger.get());
                try {
                    queue.put(++i);
                    System.out.println("producer added "+i+" "+queue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
        //consumer
        new Thread(() -> {
            while (atomicInteger.get()<10) {
                try {
                    Integer j = queue.take();
                    System.out.println("consumer took "+j+" "+queue);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
