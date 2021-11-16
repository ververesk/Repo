package udemy.function;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("roof");
        list.add("java");
        list.add("biggggest");
        list.forEach(str -> System.out.println(str));

        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(6);
        integers.add(3);
        integers.add(9);
        integers.forEach(el ->{
            System.out.println(el);
            el*=2;
            System.out.println(el);
        });
    }
}
