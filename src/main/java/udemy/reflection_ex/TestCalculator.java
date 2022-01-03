package udemy.reflection_ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import udemy.reflection_ex.Calculator;

//public class TestCalculator {
//    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
//        try (BufferedReader reader = new BufferedReader(new FileReader("test100.txt"))){
//            String methodName = reader.readLine();
//            String firstArgument = reader.readLine();
//            String secondArgument = reader.readLine();
//
//            udemy.reflection_ex.Calculator calculator = new udemy.reflection_ex.Calculator();
//             Class cl = calculator.getClass();
//             Method method = null;
//             Method[] methods = cl.getDeclaredMethods();
//            for (Method method1 : methods) {
//                if(method1.equals(methodName)) {
//                    method = method1;
//                }
//            }
//            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
