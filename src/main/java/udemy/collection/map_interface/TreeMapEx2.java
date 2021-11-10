package udemy.collection.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx2 {//не synchronized
    public static void main(String[] args) { // в кач ключа нельзя использовать объект не импл comparable
        TreeMap<Student, Double> treeMap=new TreeMap<>();
        TreeMap<Student, Double> treeMap2=new TreeMap<>((o1, o2) -> o1.surname.compareTo(o2.surname));
        Student st1 = new Student("Veronika", "Grigorovich",3);
        Student st2 = new Student("Maria", "Ivanova",1);
        Student st3 = new Student("Sergei", "Petrov",4);
        Student st4 = new Student("Igor", "Igor",3);
        Student st5 = new Student("Vasiliy", "Ivanov",1);
        Student st6 = new Student("Sasha", "Petrova",4);
        Student st7 = new Student("Elena", "Grigorovich",3);


        treeMap2.put(st1, 5.8);
        treeMap2.put(st2, 4.8);
        treeMap2.put(st7, 7.8);
        treeMap2.put(st3, 4.8);
        treeMap2.put(st5, 6.0);
        treeMap2.put(st4, 8.8);
        treeMap2.put(st6, 5.5);

        treeMap.put(st1, 5.8);
        treeMap.put(st2, 4.8);
        treeMap.put(st7, 7.8);
        treeMap.put(st3, 4.8);
        treeMap.put(st5, 6.0);
        treeMap.put(st4, 8.8);
        treeMap.put(st6, 5.5);

        System.out.println(treeMap);
        System.out.println(treeMap2);
    }
}
