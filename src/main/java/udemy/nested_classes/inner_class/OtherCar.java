package udemy.nested_classes.inner_class;
//inner class может содержать только не статик элементы
public class OtherCar {
    String color;
    int doorCount;
    Engine engine;


    public OtherCar(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine engine) {
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


    public class Engine { //если private то объекты этого класса в другом классе мы не сможем создавать
        private int horsePower; //могут быть как статич и нестатич элементы


        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class OtherTest {
    public static void main(String[] args) {
        OtherCar car = new OtherCar("black", 400);
        OtherCar.Engine engine = car.new Engine(100);
        car.setEngine(engine);
        System.out.println(car);

        OtherCar.Engine engine1=new OtherCar("red",3).new Engine(200); //так лучше не делать потому что не создается объект OtherCar
    }

}

