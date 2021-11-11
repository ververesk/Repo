package udemy.collection.queue_interface;



import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<String>();
        queue.offer("cat");
        queue.offer("dog");
        queue.offer("Igor");
        queue.offer("Veronika");
        queue.offer("Oleg");
        queue.offer("table"); //если очередь ограничена то add выбросит исключение, когда очередь переполнится, лучше add заменять на offer
        System.out.println(queue);
//        System.out.println(queue.remove()); //лучше замянть на poll , потому что если очередь закончилась то poll выбросит null а remove исключение
//        System.out.println(queue.element()); //peek возвращает верхний элемент очеред но не выбрасывае исключение в отличие от element
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());// возвращает удаленный элемент

    }
}
