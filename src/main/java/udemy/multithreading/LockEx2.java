package udemy.multithreading;



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * есть банкомат, в единицу времени им может пользоваться только один человек
 * тут расмматриватеся trylock
 */
public class LockEx2 {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("ivan", lock);
        new Employee("viktor", lock);
        new Employee("nika", lock);
        Thread.sleep(5000);
        new Employee("oleg", lock);
        new Employee("igor", lock);
    }
}

class Employee extends Thread{
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name=name;
        this.lock=lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) { //если банкомат свободен то работник им пользуется, если банкомат занят
            //то работник не хочет ждать в очереди
            try {
                //          System.out.println(name + " ждет");
                //         lock.lock();
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершил свои дела");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}
