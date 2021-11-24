package udemy.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MapToIntEx {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 5.4);
        Student st2 = new Student("Paul", 'm', 32, 5, 9.0);
        Student st3 = new Student("Igor", 'm', 20, 3, 8.4);
        Student st4 = new Student("Petr", 'm', 42, 2, 7.4);
        Student st5 = new Student("Maria", 'f', 25, 1, 9.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> courses = students.stream()
                .mapToInt(value -> value.getCourse())
                .boxed() //конвертирует из int в Integer
                .collect(Collectors.toList());

        System.out.println(courses);

        int sum=students.stream()
                .mapToInt(value -> value.getCourse())
                .sum();
        System.out.println(sum);

        OptionalInt min=students.stream()
                .mapToInt(value -> value.getCourse())
                .min();
        System.out.println(min);

        int max=students.stream()
                .mapToInt(value -> value.getCourse())
                .max().getAsInt();
        System.out.println(max);


    }
}
