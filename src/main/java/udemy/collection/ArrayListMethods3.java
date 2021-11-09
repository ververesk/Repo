package udemy.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1= new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);
        List<String> myList=arrayList1.subList(1,4); //4 не включается, myList это view, а не отдельная сущность
        System.out.println(myList);
       myList.add("Fedor");
        System.out.println(arrayList1);
        arrayList1.add("Sveta"); //так нельзя, модификации надо делать с помощб. саблиста
//        ArrayList<String> arrayList2= new ArrayList<>();
//        arrayList2.add("Ivan");
//        arrayList2.add("Mariya");
//        arrayList2.add("Igor");
//
//        arrayList1.removeAll(arrayList2); //удалим из arrayList1 все элеементы arrayList2 //retainAll работает противоположно
//        System.out.println(arrayList1);

    }
}
