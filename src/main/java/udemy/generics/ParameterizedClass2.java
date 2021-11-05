package udemy.generics;
//в рантайм вся инфа о дженериках стирается
public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1=new Pair<>("privet",20);
        System.out.println(pair1.getFirstValue()+"  "+pair1.getSecondValue());
        Pair<Integer, Double> pair2=new Pair<>(156,20.4);
        System.out.println(pair2.getFirstValue()+"  "+pair2.getSecondValue());
        OtherPair<String>otherPair=new OtherPair<>("ok", "ok");

    }

}
class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirstValue() {
        return value1;
    }
    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V> {
    private V value3;
    private V value4;

    public V abc(V value) {
        return value;
    }

    public OtherPair(V value3, V value4) {
        this.value3 = value3;
        this.value4 = value4;
    }
    public V getFirstValue() {
        return value3;
    }
    public V getSecondValue() {
        return value4;
    }
}
