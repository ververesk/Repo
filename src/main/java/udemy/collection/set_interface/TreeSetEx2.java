package udemy.collection.set_interface;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) { //мы делаем Comparable по имени, поэтому даже если курсы разные ноимена одинаковые, это воспринимается как одинаковы студент, поэтому из
        Set<Student> set=new TreeSet<>(); //equals и хэшкода надо поубирать сравнение по курсу
        Student st1=new Student("Zaur",1);
        Student st2=new Student("Smith",2);
        Student st3=new Student("Paul",5);
        Student st4=new Student("Oleg",3);
        Student st5=new Student("Oleg",2);
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);
        set.add(st5);
        Student st6=new Student("Omar",3);
        System.out.println(set);
        System.out.println(st4.equals(st5));
    }
}
class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.course-o.course;
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
