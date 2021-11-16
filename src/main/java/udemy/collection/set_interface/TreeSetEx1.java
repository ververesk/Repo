package udemy.collection.set_interface;



import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(7);
        set.add(4);
        set.add(5);
        set.add(3);
        set.add(8); //null добавить нельзя
        System.out.println(set); //выводит по возрастанию
    }
}
