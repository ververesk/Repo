package udemy.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentInfo {
    void testStudents(List<Student> students, StudentChecks sc) {
        for (Student st : students) {
            if (sc.chek(st)) {
                System.out.println(st);
            }
        }
    }
}


class Test {
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

        StudentInfo info = new StudentInfo();
        Collections.sort(students, (o1, o2) -> o1.course-o2.course);
        System.out.println(students);
        info.testStudents(students, (Student s) -> s.avgGrade > 8);
        System.out.println("_______________________________________");
        info.testStudents(students, (Student s) -> s.sex == 'f');
        System.out.println("_______________________________________");
        info.testStudents(students,  s -> s.age > 25 && s.avgGrade > 8.0); //можно писать и так
        StudentChecks st=(Student s) -> s.sex == 'f'; //можно и так
        info.testStudents(students,st);
    }
}

interface StudentChecks { //функциональный интерфейс, в нем есть только один абстрактный метод и тогда можно использовать лямбду
    boolean chek(Student s);
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean chek(Student s) {
        return s.avgGrade > 8;
    }
}
