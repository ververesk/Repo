package udemy.reflection_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class empClass = Class.forName("udemy.reflection_ex.Employee"); //объект класса Класс наш класс Emp
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
            System.out.println("Type of "+field.getName()+ " = "+field.getType()); //тут будут и приватные поля
        }

        System.out.println("***********************");
        Method increaseSalary = empClass.getMethod("increaseSalary");
        System.out.println("return type of method increaseSalary = "+
                increaseSalary.getReturnType()+ ", parameter types = " + Arrays.toString(increaseSalary.getParameterTypes()));

        System.out.println("***********************");
        Method setSalary = empClass.getMethod("setSalary", double.class); //надо писать параметры если они есть double c маленькой потому что примитив
        System.out.println("return type of method increaseSalary = "+
                setSalary.getReturnType()+ ", parameter types = " + Arrays.toString(setSalary.getParameterTypes()));
        System.out.println("***********************");
        Method[] empClassMethods = empClass.getMethods(); //тут будут все методы кроме приватных, но будут классы родителей в том числе и object
        for (Method method : empClassMethods) {
            System.out.println("Name of method =  "+method.getName()+ " , return type =  "+method.getReturnType()
            + "parameter types = "+Arrays.toString(method.getParameterTypes())); //тут будут и приватные поля
        }
//getDeclaredMethods вернет в том числе и приватные метода, но только самого класса без родителей
        System.out.println("***********************");
        Method[] empClassMethods2 = empClass.getDeclaredMethods(); //хотим вернуть только public методы
        for (Method method : empClassMethods2) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method =  " + method.getName() + " , return type =  " + method.getReturnType()
                        + "parameter types = " + Arrays.toString(method.getParameterTypes())); //тут будут и приватные поля
            }
        }
        System.out.println("***********************");
        Constructor constructor1 = empClass.getConstructor(); //если параметры не укажем то выведется конструктор без параметров
        System.out.println("Con has "+constructor1.getParameterCount()+ " parameters, their types are: "
        + Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("***********************");
        Constructor constructor2 = empClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Con has "+constructor2.getParameterCount()+ " parameters, their types are: "
                + Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("***********************");
        Constructor[] empClassConstructors = empClass.getConstructors();
        for (Constructor constructor : empClassConstructors) {
                System.out.println("constructor has "+constructor.getParameterCount()+ " parameters, their types are: "
                        + Arrays.toString(constructor.getParameterTypes()));
            }
        //getDeclaredConstructors показывает и приватные конструкторы


    }
}
