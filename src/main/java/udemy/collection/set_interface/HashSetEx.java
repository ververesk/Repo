package udemy.collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>(); //содержит только уникальные значения
        set.add("cat");
        set.add("dog");
        set.add("Igor");
        set.add("Veronika");
        set.add("Oleg");
        set.add("table");
        //set.add(null); можно добавлять
        System.out.println(set.size());
        System.out.println(set.contains("cat"));

    }
}
