package udemy.function;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {
    void testStudents(List<Student> students, Predicate<Student> pr) { //Predicate это функциональный интерфейс, у него один метод test boolean
        for (Student st : students) {
            if (pr.test(st)) {
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
//        Collections.sort(students, (o1, o2) -> o1.course-o2.course);
//        System.out.println(students);
        Predicate<Student> pr1=student -> student.avgGrade<8.5;
        Predicate<Student> pr2=student -> student.sex=='m';
        info.testStudents(students,pr1.and(pr2)); //объединяем две проверки
        System.out.println("_______________________________________");
        info.testStudents(students,pr1.or(pr2)); //объединяем две проверки
//        info.testStudents(students, (Student s) -> s.avgGrade > 8);
//        System.out.println("_______________________________________");
//        info.testStudents(students, (Student s) -> s.sex == 'f');
//        System.out.println("_______________________________________");
//        info.testStudents(students,  s -> s.age > 25 && s.avgGrade > 8.0); //можно писать и так
        double result=avgOfSmth(students, student -> student.avgGrade);
        System.out.println(result);

    }
    private static double avgOfSmth(List<Student> students, Function<Student, Double> function) {
        double result=0;
        for( Student st : students) {
            result+=function.apply(st);
        }
        result=result/students.size();
        return result;
    }
}


