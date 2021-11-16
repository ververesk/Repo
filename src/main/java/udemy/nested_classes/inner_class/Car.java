package udemy.nested_classes.inner_class;

public class Car {

        String color;
        int doorCount;
        Engine engine;


        public Car(String color, int doorCount, int horsePower) {
            this.color = color;
            this.doorCount = doorCount;
            this.engine = this.new Engine(horsePower); //this текущий объект
        }

        @Override
        public String toString() {
            return "My car{" +
                    "color='" + color + '\'' +
                    ", doorCount=" + doorCount +
                    ", engine=" + engine +
                    '}';
        }

//        void method() {
//            System.out.println(udemy.nested_classes.static_nested_class.Car.Engine.countOfObjects);
//            udemy.nested_classes.static_nested_class.Car.Engine engine1=new udemy.nested_classes.static_nested_class.Car.Engine(150);
//            System.out.println(engine1.horsePower);
//        }

        public class Engine{ //если private то объекты этого класса в другом классе мы не сможем создавать
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

    class Test {
        public static void main(String[] args) {
            Car car=new Car("black",400,300);
            System.out.println(car);

        }

    }

