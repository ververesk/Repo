package udemy.collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDegEx1 { //двунаправленная очередь, элементы могут добавляться как в начало так и в конец
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1); //тоже самое что и add но без выбрасывания исключений
        deque.offerLast(8);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.peekFirst()); //можно заменить на get , но если очередь пустая то выбрасится исключение
        System.out.println(deque.peekLast());
    }
}
