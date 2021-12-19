package udemy.work_with_files.programmer1;

import java.io.Serializable;
//обязательно долен быть Serializable
public class Employee implements Serializable {
    static final long serialVersionUID  = 2; //это надо делать для того чтобы версии объектов у всех программистов были одинаковы
    String name;
    String surname;
    String department;
 //   int age;
    transient double salary; //чтобы при сериализации эти данные не записывались
    Car car;

    public Employee(String name, String surname, String department,
 //                   int age,
                    double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
  //      this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
    //            ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
