package udemy.function;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("roof");
        list.add("java");
        list.add("biggggest");
        list.removeIf(element -> element.length()<4);
        System.out.println(list);

    }
}
