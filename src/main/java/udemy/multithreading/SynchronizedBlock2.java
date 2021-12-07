package udemy.multithreading;

public class SynchronizedBlock2 {
    static int counter = 0;
    /*
    монитор на объекте this использоваться не может, потому что метод статичный
    то есть используется монитор всего класса
     */
    public  static void increment() { //одномоментно метод работает только с одним потоком
        synchronized (SynchronizedBlock2.class) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new R2());
        Thread t2 = new Thread(new R2());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);
    }
}

class R2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex11Synch.increment();
        }
    }
}
