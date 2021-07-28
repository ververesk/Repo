package TAsk54;

public class Runner {
    static Thread [] threads=new Thread[5];

    public static void main(String[] args) {
        ThirdThread third=new ThirdThread();
        for (int i = 0; i < 5; i++) {
            threads[i]=new Thread(third);
            threads[i].setName("номер "+i);
            threads[i].start();
        }
    }
}
