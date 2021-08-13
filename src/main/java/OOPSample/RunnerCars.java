package OOPSample;

public class RunnerCars {
    public static void main(String[] args) {
        new RunnerCars.LuxuriousCar().printlnDesire();
        new RunnerCars.CheapCar().printlnDesire();
        new RunnerCars.Ferrari().printlnDesire();
        new RunnerCars.Lanos().printlnDesire();

    }
    public static class Ferrari extends LuxuriousCar{
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING+Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING+Constants.LANOS_NAME);
        }
    }

    public static class LuxuriousCar {
         void printlnDesire() {
            System.out.println(Constants.WANT_STRING+Constants.LUXURIOUS_CAR);
        }

    }
    public static class CheapCar {
         void printlnDesire() {
            System.out.println(Constants.WANT_STRING+Constants.CHEAP_CAR);
        }
    }
    public static class Constants {
        public static String WANT_STRING="Я хочу езить на ";
        public static String LUXURIOUS_CAR=" роскошной машине";
        public static String CHEAP_CAR=" дешевой машине";
        public static String FERRARI_NAME="Феррари";
        public static String LANOS_NAME="Ланосе";
    }
}
