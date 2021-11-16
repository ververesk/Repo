package udemy.lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
    void testStudents(List<Student> students, StudentChecks sc) {
        for (Student st : students) {
            if (sc.chek(st)) {
                System.out.println(st);
            }
        }
    }

//    void printStudentsOverGrade(List<Student> a1, double grade) {
//        for (Student st : a1) {
//            if(st.avgGrade>grade) {
//                System.out.println(st);
//            }
//        }
//    }
//
//    void printStudentsUnderGrade(List<Student> a1, int age) {
//        for (Student st : a1) {
//            if(st.age>age) {
//                System.out.println(st);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(List<Student> a1, int age, double grade, char sex) {
//        for (Student st : a1) {
//            if(st.age>age && st.avgGrade<grade && st.sex==sex) {
//                System.out.println(st);
//            }
//        }
//    }
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
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("_______________________________________");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean chek(Student s) {
//                return s.age<30;
//            }
//        });
        info.testStudents(students, (Student s) -> s.avgGrade > 8);
        System.out.println("_______________________________________");
        info.testStudents(students, (Student s) -> s.sex == 'f');
        System.out.println("_______________________________________");
        info.testStudents(students, (Student s) -> s.age > 25 && s.avgGrade > 8.0);
//        info.printStudentsOverGrade(students, 8);
//        System.out.println("_________________________________");
//        info.printStudentsUnderGrade(students, 30);
//        System.out.println("_________________________________");
//        info.printStudentsMixCondition(students, 20,9.0,'f');
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
