package udemy.multithreading;

public class SyncronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableImpl2 runnable = new MyRunnableImpl2(); //синхронизаиця будет вестить на объекте runnable
        /**
         * монитор будет занят у runnable
         */
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter2 {
    static int count = 0;

}

class MyRunnableImpl2 implements Runnable {
    private void doWork2() {
        System.out.println("Hi!!!");
    }
    private void doWork1() {
        doWork2();
        synchronized (this) {
            System.out.println(this);//обьект (или название класса)на котором мы будем синхронизироваться
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }

    @Override
    public String toString() {
        return "MyRunnableImpl2{}";
    }
}
