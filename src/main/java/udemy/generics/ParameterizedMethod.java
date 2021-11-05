package udemy.generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> all=new ArrayList<>();
        all.add(10);
        all.add(20);
        all.add(5);
        int a=GenMethod.getSecondElement(all);
        System.out.println(a);

        ArrayList<String> all1=new ArrayList<>();
        all1.add("asd");
        all1.add("3gf");
        all1.add("rrr");
        String s=GenMethod.getSecondElement(all1);
        System.out.println(s);
    }

}

class GenMethod{
public static <T> T getSecondElement(ArrayList<T> list) {
    return list.get(1);
}
}

