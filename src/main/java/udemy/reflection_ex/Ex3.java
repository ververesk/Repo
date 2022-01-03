package udemy.reflection_ex;

import java.lang.reflect.Field;

/*
предварительно закомментировали геттер и сеттер для salary и конструктор куда salary входит и сделали дефолтное значение 1000
 */
public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Veronika", "IT");
        Class empClass = employee.getClass();
        Field field = empClass.getDeclaredField("salary");
        field.setAccessible(true); //хотим получить доступ к приватному полю
        double salaryValue = (Double)field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 1500);
        System.out.println(employee);
    }

}
