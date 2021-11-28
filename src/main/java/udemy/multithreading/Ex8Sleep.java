package udemy.multithreading;

import java.sql.SQLOutput;

public class Ex8Sleep extends Thread{
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new MyRunnable1());
        Ex8Sleep thread2 = new Ex8Sleep();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
//поток в котором вызывается join в данном случае поток в котором вызывается join это main
        //main будет ждать поток на котором вызван join , то есть будет жать пока потоки  thread1м и thread2 не завершат работу
        System.out.println("THE END");
    }
}



class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " "+i);
        }
    }
}
