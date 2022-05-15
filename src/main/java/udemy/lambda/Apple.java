package udemy.lambda;

public class Apple {
    private int weight;

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Apple(int weight) {
        this.weight = weight;
    }

    public Apple() {
    }
}
