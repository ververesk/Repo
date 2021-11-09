package udemy.collection;

import java.util.Stack;

public class StackExample2 { //редко используется но synchronized
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Zaur");
        stack.push("Ivan");
        stack.push("Mariya");
        stack.push("Katya");
        System.out.println(stack);
        System.out.println(stack.pop()); //выводит на экран последний элемент и сразу его удаляет, pick выводит на экран последний элемент и сразу его удаляет
        System.out.println(stack);
    }
}
