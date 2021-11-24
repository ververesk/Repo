package udemy.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx {
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

        Map<Integer, List<Student>> collect = students.stream() //то есть у нас будет мапа где ключ курс, а значение лист студентов
                .map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .collect(Collectors.groupingBy(student -> student.getCourse()));//сгруппировать студентов по курсу

        for (Map.Entry<Integer, List<Student>> entry: collect.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        Map<Boolean, List<Student>> collect2 = students.stream() //ключем будет boolean
                .collect(Collectors.partitioningBy(student -> student.getAvgGrade()>8)); //тут разбиваются студенты на группы будет две группы

        for (Map.Entry<Boolean, List<Student>> entry: collect2.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
