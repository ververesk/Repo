package udemy.multithreading;

import java.util.concurrent.Semaphore;

/**
 * у нас есть телефонная будка. Одновременно звноить могут только два человека
 */
public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(3);
        new Person("nika", callBox);
        new Person("oleg", callBox);
        new Person("victor", callBox);
        new Person("marina", callBox);
        new Person("igor", callBox);
    }
}
class Person
        extends Thread
{
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " ждет");
            callBox.acquire(); //предназначен для попытки получить разрешение от семафора
            //acquire() заблокирует попток пока ресурс не будет доступен
            //после доступности получаем разрешение и counter уменьшается на единицу
            System.out.println(name + " пользуется телефонной будкой");
            sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release(); //освобождаем counter увеличивается на единицу
        }
    }
}
