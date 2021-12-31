package udemy.reflection_ex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class empClass = Class.forName("reflection_ex.Employee"); //объект класса Класс наш класс Emp
//        Class empClass2 = Employee.class; //2 вариант создания
//        Employee employee = new Employee();
//        Class empClass3 = employee.getClass(); //3 вариант

        Field idField = empClass.getField("id");
        System.out.println("Type of id field: "+idField.getType());
        System.out.println("***********************");
        Field[] empClassFields = empClass.getFields();
        for (Field field : empClassFields) {
            System.out.println("Type of "+field.getName()+ " = "+field.getType()); //тут не будет privat поле
        }
        System.out.println("***********************");
        Field[] empClassDeclaredFields = empClass.getDeclaredFields();
        for (Field field : empClassDeclaredFields) {
            System.out.println("Type of "+field.getName()+ " = "+field.getType()); //тут будут и правтные поля
        }

        System.out.println("***********************");
        Method increaseSalary = empClass.getMethod("increaseSalary");
        System.out.println("return type of method increaseSalary = "+
                increaseSalary.getReturnType()+ ", parameter types = " + Arrays.toString(increaseSalary.getParameterTypes()));

        System.out.println("***********************");
        Method setSalary = empClass.getMethod("setSalary", double.class); //надо писать параметры если они есть double c маленькой потому что примитив
        System.out.println("return type of method increaseSalary = "+
                setSalary.getReturnType()+ ", parameter types = " + Arrays.toString(setSalary.getParameterTypes()));
    }
}
