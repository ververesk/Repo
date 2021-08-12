package OOPSample.Singleton;

public class MySingleton {
    private static MySingleton mySingleton;

    private MySingleton() {

    }
    public static MySingleton getMySingleton() {
        if(mySingleton==null) {
            mySingleton=new MySingleton();
            System.out.println("Ура");
        } return mySingleton;
    }
}
