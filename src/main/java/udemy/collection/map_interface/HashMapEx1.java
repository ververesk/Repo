package udemy.collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1=new HashMap<>(); //HashMap не хранит порядок добавления
        map1.put(1000, "Veronika Grigorovich"); //если пытаеся вставить элемент с одинаковым ключом, то старое значение ключа перетирается на новое
        map1.put(2222, "Ivan Ivanov");
        map1.put(3333, "MAria Sidorova");
        map1.putIfAbsent(1000, "Nikolai Petrov"); //добавь если такого элемента нет
        map1.remove(1000);
        map1.putIfAbsent(1000, "Nikolai Petrov"); //добавь если такого элемента нет
        System.out.println(map1);
        System.out.println(map1.containsValue("igor"));
        System.out.println(map1.containsKey(1000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
