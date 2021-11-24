package udemy.stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 5.4);
        Student st2 = new Student("Paul", 'm', 32, 5, 9.0);
        Student st3 = new Student("Igor", 'm', 20, 3, 8.4);
        Student st4 = new Student("Petr", 'm', 42, 2, 7.4);
        Student st5 = new Student("Maria", 'f', 25, 1, 9.4);

        Faculty economic=new Faculty("economic");
        Faculty math=new Faculty("math");
        economic.addStudentToFaculty(st1);
        economic.addStudentToFaculty(st2);
        economic.addStudentToFaculty(st3);
        math.addStudentToFaculty(st4);
        math.addStudentToFaculty(st5);

        List<Faculty> facultyList=new ArrayList<>();;
        facultyList.add(economic);
        facultyList.add(math);

        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream()) //сначала находим первый элемент, потом второй элемент листа
                .forEach(student -> System.out.println(student.getName()));




    }
}

class Faculty{

    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty=new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentsOnFaculty.add(st);
    }

}