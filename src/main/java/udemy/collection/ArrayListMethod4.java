package udemy.collection;

import java.util.ArrayList;

public class ArrayListMethod4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);
        String[] array = arrayList1.toArray(new String[0]);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
//List.Of неизменяемые, add не работает