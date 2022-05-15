package udemy.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx {
    public static void main(String[] args) throws IOException {
        String s = processFile(b -> b.readLine());
        System.out.println(s);
        List<String> stringList = new ArrayList<>(List.of("one", "null", "two"));
        List<String> notNullString = filter(stringList, s1 -> !s1.equals("null"));
        stringList.add("f");
        System.out.println(notNullString);
        System.out.println(stringList);
        List<String> str = Arrays.asList("a", "b", "A", "B");
        str.sort(String::compareToIgnoreCase);
        //     str.sort((o1, o2) -> o1.compareToIgnoreCase(o2)); тоже самое

        Function<Integer, Apple> function = (weight -> new Apple(weight));
        Apple apple = function.apply(12);
        List<Integer> weights = Arrays.asList(1, 3, 5, 10, 5);
        List<Apple> apples = map(weights, Apple::new);
        System.out.println(apples);
        /*
        сортируем с помощью анонимного класса
         */
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight()-o2.getWeight();
            }
        });
/*
c помощью лямбды
 */
        apples.sort((o1, o2) -> o1.getWeight()-o2.getWeight());
/*
с помощью ссылки на метод
 */
        apples.sort(Comparator.comparingInt(Apple::getWeight));
        System.out.println("sorted apples: "+apples);
    }

    private static List<Apple> map(List<Integer> weights, Function<Integer, Apple> f) {
        List<Apple> result = new ArrayList<>();
        for (Integer integer: weights) {
            result.add(new Apple(integer));
        }
        return result;
    }

    public static String processFile(BufferedReaderProcessor readerProcessor) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"))) {
            return readerProcessor.process(bufferedReader);
        }
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}
