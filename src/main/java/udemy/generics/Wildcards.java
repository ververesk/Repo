package udemy.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<?> list=new ArrayList<Integer>();//вместо вопроса может быть подставлен абсолютно люой класс
        List<Double> doubleList=new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(3.15);
        doubleList.add(3.16);
        showListInfo(doubleList);
        List<String> listString = new ArrayList<>();
        listString.add("ok");
        listString.add("hi");
        listString.add("bye");
        showListInfo(listString);

        List<? extends Number> list30=new ArrayList<>(); //? extends Number вместо вопроса может быть подставлен абсолютно люой класс , но который extends Number
ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(3.14);
        doubleArrayList.add(3.15);
        doubleArrayList.add(3.16);
        System.out.println(summ(doubleList));

        List<? super Integer> listSuper=new ArrayList<Number>(); // можно использовать Integer либо другой класс который является родителем Integer
    }

    static void showListInfo(List<?> list) {
        System.out.println("Мой лист содержит элементы: "+list);
    }

    public static double summ(List<? extends Number> list30) {
        double summ=0;
        for (Number n: list30) {
            summ+=n.doubleValue(); //get использовавать нельзя потому что в Number нет такого метода
        }
        return summ;
    }
}
