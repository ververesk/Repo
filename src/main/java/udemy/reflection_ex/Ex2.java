package udemy.reflection_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class empClass = Class.forName("udemy.reflection_ex.Employee");
        Employee o = (Employee)empClass.newInstance();
        System.out.println(o); //тут дефолтные значения

        Constructor<Employee> constructor1 = empClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = empClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Veronika", "IT");
        System.out.println(obj2);

        Method method = empClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88); //вызываем метод с помощью рефлексии
        System.out.println(obj2);

    }
}
