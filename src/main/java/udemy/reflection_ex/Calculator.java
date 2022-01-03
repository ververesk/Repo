package udemy.reflection_ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Сумма " + a + " и " + b + " = " + result);
    }

    void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Разница " + a + " и " + b + " = " + result);
    }

    void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Произведение " + a + " и " + b + " = " + result);
    }

    void division(int a, int b) {
        int result = a / b;
        System.out.println("Частное " + a + " и " + b + " = " + result);
    }
}

    class TestCalculator {
        public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
            try (BufferedReader reader = new BufferedReader(new FileReader("test100.txt"))){
                String methodName = reader.readLine();
                String firstArgument = reader.readLine();
                String secondArgument = reader.readLine();

                Calculator calculator = new Calculator();
                Class cl = calculator.getClass();
                Method method = null;
                Method[] methods = cl.getDeclaredMethods();
                for (Method method1 : methods) {
                    if(method1.getName().equals(methodName)) {
                        method = method1;
                    }
                }
                method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

