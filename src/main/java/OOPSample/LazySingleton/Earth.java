package OOPSample.LazySingleton;

public class Earth implements Planet {
    private static volatile Earth instance;
    private Earth(){}
    public static Earth getInstance() {
        if(instance==null) {
            synchronized (Earth.class) {
                if (instance == null) {
                    instance = new Earth();
                    System.out.println("Earth");
                }
            }
        } return instance;
    }
}
