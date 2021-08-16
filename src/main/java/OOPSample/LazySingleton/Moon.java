package OOPSample.LazySingleton;

public class Moon implements Planet{
    private static volatile Moon instance;
    private Moon(){}
    public static Moon getInstance() {
        if(instance==null) {
            synchronized (Moon.class) {
                if (instance == null) {
                    instance = new Moon();
                    System.out.println("Moon");
                }
            }
        } return instance;
    }
}
