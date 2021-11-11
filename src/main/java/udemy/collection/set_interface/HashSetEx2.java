package udemy.collection.set_interface;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1=new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);

        HashSet<Integer> hashSet2=new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(3);
        hashSet2.add(8);

        HashSet<Integer> union=new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);

        HashSet<Integer> intersect=new HashSet<>(hashSet1); //возвращает только общие элементы с обоих множеств
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        HashSet<Integer> subtrack=new HashSet<>(hashSet1); //возвращает только те элементы из первого множества которых нет во втором множестве
        subtrack.removeAll(hashSet2);
        System.out.println(subtrack);

    }
}
