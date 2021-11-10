package udemy.collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap=new LinkedHashMap<>(16, 0.75f, false); //в каком порядке добавили, в таком порядяке и будет вывод
        Student st1 = new Student("Veronika", "Grigorovich",3);
        Student st2 = new Student("Maria", "Ivanova",1);
        Student st3 = new Student("Sergei", "Petrov",4);
        Student st4 = new Student("Igor", "Igor",3);

        linkedHashMap.put(5.8, st4);
        linkedHashMap.put(6.8, st3);
        linkedHashMap.put(7.8, st2);
        linkedHashMap.put(4.8, st1);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(4.8));
        System.out.println(linkedHashMap.get(5.8));

        System.out.println(linkedHashMap);

    }
}
