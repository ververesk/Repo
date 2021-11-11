package udemy.collection.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(-100);
        priorityQueue.add(15);
        priorityQueue.add(-6);
        priorityQueue.add(45);

        System.out.println(priorityQueue.peek()); //-6 наивысший приорите
        System.out.println(priorityQueue); //но очередность не соблюдается, но на первом месте стоит самый маленький предамет

    }
}
