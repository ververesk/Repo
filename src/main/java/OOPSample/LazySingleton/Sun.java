package OOPSample.LazySingleton;

public class Sun implements Planet {
    private static volatile Sun instance=null;
    private Sun(){}
    public static Sun getInstance() {
        if(instance==null) {
            synchronized (Earth.class) {
                if (instance == null) {
                    instance = new Sun();
                    System.out.println("Sun");
                }
            }
        } return instance;
    }
}
