package udemy.collection;

import java.util.Vector;

public class VectorExample {// vector безопасен в многопотоке, но не рекомендован к использованию
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Zaur");
        vector.add("Ivan");
        vector.add("Mariya");
        vector.add("Katya");
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(0));
    }
}

