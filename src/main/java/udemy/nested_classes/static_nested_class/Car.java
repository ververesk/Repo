package udemy.nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int e;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

        void method() {
            System.out.println(Engine.countOfObjects);
            Engine engine1=new Engine(150);
            System.out.println(engine1.horsePower);
        }

    public static class Engine{ //если private то объекты этого класса в другом классе мы не сможем создавать
        int horsePower; //могут быть как статич и нестатич элементы
        static int countOfObjects;


        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
            System.out.println(e); //private static можно обращаться
       //     System.out.println(doorCount); //к нестатик нельзя
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine =new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("red", 4, engine);
        System.out.println(car);
    }

}
