package udemy.stream;

import java.util.Arrays;

public class ForEachEx { //ForEach возвращает void
    public static void main(String[] args) {
        int[] array = {4, 1, 65, 2, 5};
        Arrays.stream(array)
                .forEach(System.out::println);
        Arrays.stream(array)
                .forEach(value -> {
                    value *= 2;
                    System.out.println(value);
                });
        Arrays.stream(array)
                .forEach(Utils::myMethod); //ссылка на метод
        Arrays.stream(array) //тоже самое
                .forEach(value -> Utils.myMethod(value));
    }

}

class Utils {
    public static void myMethod(int a) {
        a=a+5;
        System.out.println("element= "+a);
    }

}
