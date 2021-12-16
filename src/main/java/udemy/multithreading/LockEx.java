package udemy.multithreading;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
когда любой из этих потоков начнет обрабатывать какой то метод
то другие потоки в этот же момент не смогут обработать свои методы
 */
public class LockEx {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsAppCall();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    Lock lock = new ReentrantLock();//тоже самое что и synchronized, плюс synchronized его не надо делать unlock

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    void whatsAppCall() {
        lock.lock();
        try {
            System.out.println("whatsApp call starts");
            Thread.sleep(7000);
            System.out.println("whatsApp call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
