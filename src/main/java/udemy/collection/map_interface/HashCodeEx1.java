package udemy.collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map=new HashMap<>();
        Student st1 = new Student("Veronika", "Grigorovich",3);
        Student st2 = new Student("Maria", "Ivanova",1);
        Student st3 = new Student("Sergei", "Petrov",4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);

        Student st4 = new Student("Veronika", "Grigorovich",3);
        Student st5 = new Student("Igor", "Sidorov",4);
        boolean result = map.containsKey(st4);
        System.out.println("result = "+result); //вернётся false. хотя equals true. если переопределить hashCode, то вернётся true
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st4.hashCode());
        for (Map.Entry<Student, Double> entry: map.entrySet()) { //Node содержит ключ, значение хэш и сслыку на след элемент
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }

        Map<Integer, String> map2=new HashMap<>(16,0.75f); //после создания HashMap будет создан массив 16 элементами после того как HashMap заполнится на 75 проц массив увеличится вдвое
    }
}

class Student implements Comparable<Student>{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

//    @Override
//    public int hashCode() { //хэшход работает быстрее чем equals
//        return Objects.hash(name, surname, course);
//    }
    //в дефолтной реализации возвращается адрес объекта путем конвертации в число

    @Override //так работать будет неправильно, коллизия если у разных объектов одинаковый хэшход, чтобы этого не было надо умножать на простые числа
    public int hashCode() {
        return name.length()*7+surname.length()*11+course;
    }

    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}
