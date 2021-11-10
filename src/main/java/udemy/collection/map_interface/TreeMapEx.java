package udemy.collection.map_interface;

import java.util.TreeMap;

public class TreeMapEx {
    //пары хвранятся в отсортированным порядке по возрастанию
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap=new TreeMap<>();
        Student st1 = new Student("Veronika", "Grigorovich",3);
        Student st2 = new Student("Maria", "Ivanova",1);
        Student st3 = new Student("Sergei", "Petrov",4);
        Student st4 = new Student("Igor", "Igor",3);
        Student st5 = new Student("Vasiliy", "Ivanov",1);
        Student st6 = new Student("Sasha", "Petrova",4);
        Student st7 = new Student("Elena", "Grigorovich",3);
    //    Student st8 = new Student("Petr", "Grigorovich",3); если есть одинаковые ключи то значение перезапишется

        treeMap.put(5.8, st1);
        treeMap.put(6.8, st2);
        treeMap.put(7.8, st7);
        treeMap.put(4.8, st3);
        treeMap.put(6.0, st5);
        treeMap.put(8.8, st4);
        treeMap.put(5.5, st6);
   //     treeMap.put(7.8, st8);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap()); //выводится по убыванию
        System.out.println(treeMap.tailMap(7.8)); //выведутся те, у кого значение выши, headMap наоборот
        System.out.println(treeMap.lastEntry()); //выводится последнее значение firstEntry наоборот


    }
}
