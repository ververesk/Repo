package udemy.stream;

import java.sql.SQLOutput;
import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream3 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream4 = Stream.concat(stream2, stream3); //после него нелья использовать промежуточный метод
        stream4.forEach(System.out::println);

        Stream<Integer> stream5 = Stream.of(6, 7, 8, 9, 10, 10, 5, 15);

        System.out.println("Количество элементов " + stream1.count());
        //  System.out.println(stream4.count()); выбросится исключение stream нельзя переиспользовать

        System.out.println(stream5.distinct().peek(System.out::println).count());
    }
}
