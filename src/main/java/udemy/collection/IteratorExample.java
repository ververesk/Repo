package udemy.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Ivan");
        arrayList.add("Mariya");
        arrayList.add("Kolya");
        arrayList.add("Elena");

        Iterator<String> iterator = arrayList.iterator(); //с помощью итератора можно удалять элементы коллекции в
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList+"Пусто");
    }
}
