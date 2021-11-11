package udemy.collection.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx2 {
    public static void main(String[] args) { //тут приоритет как буквы в алфавите, самый высокий у первой буквы алфавита
        Student st1=new Student("Zaur",1);
        Student st2=new Student("Smith",2);
        Student st3=new Student("Paul",5);
        Student st4=new Student("Oleg",3);
        Student st5=new Student("Igor",2);
        Queue<Student> queue=new PriorityQueue<>();
        queue.add(st1);
        queue.add(st2);
        queue.add(st3);
        queue.add(st4);
        queue.add(st5);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
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
