package udemy.multithreading;

public class Ex11Synch {
    static int counter = 0;
    public synchronized static void increment() { //одномоментно метод работает только с одним потоком
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new R());
        Thread t2 = new Thread(new R());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);
    }
}

class R implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex11Synch.increment();
        }
    }
}
