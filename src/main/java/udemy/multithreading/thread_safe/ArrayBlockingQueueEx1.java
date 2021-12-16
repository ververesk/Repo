package udemy.multithreading.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4); //может содержать ттолько 4 эл
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5); //exception не будет но элемент не добавится
        System.out.println(queue);
    }
}
