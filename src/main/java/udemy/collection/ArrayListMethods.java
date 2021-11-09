package udemy.collection;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList1= new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");

        ArrayList<String> arrayList2= new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("&&&");

   //     arrayList1.addAll(arrayList2);

        arrayList1.addAll(1, arrayList2); //добавляются с первой позиции
        System.out.println(arrayList1.indexOf("Ivan")); //нахходим инлекс на котором находится Иван , если иванов несколько то возвращается первое совпадениек
        System.out.println(arrayList1.contains("Ivan")); //содержится ли объект, проверяет с помощью equals
    }
}
