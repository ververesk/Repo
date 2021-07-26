import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class collectToList {
    public static void main(String[] args) {
        Stream <Integer> numbers= Stream.of(-1,10,-3,46,2,-4);
        Stream <String> stringStream=Stream.of("kkkkkkkk","dd", "ddddddddd", "dsa");
        Stream <String> stringStream1=Stream.of("kkkkkkkk","dd", "ddddddddd", "dsa");
        getPositiveNumbers(numbers).forEach(System.out::println);
        getMap(stringStream1).forEach((s,i)-> System.out.println(s+" - "+i));
        getFiltredString(stringStream).forEach(System.out::println);
    }
    public static List <Integer> getPositiveNumbers(Stream <Integer> numbers) {
       return numbers.filter((x)->x>0)
                .collect(Collectors.toList());
    }

    public static Set<String> getFiltredString(Stream <String> stringStream) {
        return stringStream.filter((x)->x.length()>6)
                .collect(Collectors.toSet());
    }

    public static Map<String, Integer>getMap( Stream <String> stringStream1) {
 return stringStream1.collect(Collectors.toMap(word -> word, String::length));
    }
}
