package udemy.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEx {
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

        students = students.stream()
                .sorted((x,y)->x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());

        System.out.println(students);


        students = students.stream()
                .filter(student -> student.getAge()>22 && student.getAvgGrade()<9.4)
                .collect(Collectors.toList());
        System.out.println(students);
    }
}
 class Student {
    private String name;
     private char sex;
     private int age;
     private int course;
     private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public char getSex() {
         return sex;
     }

     public void setSex(char sex) {
         this.sex = sex;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getCourse() {
         return course;
     }

     public void setCourse(int course) {
         this.course = course;
     }

     public double getAvgGrade() {
         return avgGrade;
     }

     public void setAvgGrade(double avgGrade) {
         this.avgGrade = avgGrade;
     }

     @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
