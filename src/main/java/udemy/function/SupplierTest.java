package udemy.function;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class SupplierTest {
    public static List<Car> create3cars(Supplier<Car> carSupplier) {
        List<Car> carList=new ArrayList<>();
        for(int i = 0; i<3; i++) {
            carList.add(carSupplier.get());
        }
        return carList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);

    }

    public static void main(String[] args) {
        List<Car> ourCars=create3cars(() -> new Car("Tesla","black",1.6));
        System.out.println(ourCars);
        changeCar(ourCars.get(0)
        , car -> {car.color="red"; car.engine=2.5;
                    System.out.println("upgraded car: "+ ourCars);});
    }
}
class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
