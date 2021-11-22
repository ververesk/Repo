package udemy.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Map1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("table");
        list.add("meow");
        // 3 3 5 4
        List<Integer> list2 = list.stream()
                .map(element -> element.length())
                .collect(Collectors.toList());

        int[] array = {2, 3, 4, 5};
        array = Arrays.stream(array) //если лямбда содержит больше одного выражение то надо брать в фиг скобки
                .map(element -> {
                    if (element %2==0){
                        element = element / 2;
                    }
                    return element;
                })
        .toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("cat");
        set.add("dog");
        set.add("table");
        set.add("meow");

        Set<Integer> set2=set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}
