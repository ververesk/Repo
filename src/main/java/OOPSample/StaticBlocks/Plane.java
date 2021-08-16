package OOPSample.StaticBlocks;

public class Plane implements CanFly{
    int numberOfPassengersCarried;

    public Plane(int numberOfPassengersCarried) {
        System.out.println("Заработало");
        this.numberOfPassengersCarried = numberOfPassengersCarried;
    }

    @Override
    public void fly() {

    }
}
