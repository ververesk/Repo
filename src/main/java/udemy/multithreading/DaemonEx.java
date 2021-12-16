package udemy.multithreading;
/*
daemon потоки это потоки выполнения которых программа не будет дожидаться. ТО есть она завершиться а
эти потоки так и останутся незаверщенными
 */
public class DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemonThread");
        daemonThread.setDaemon(true); //делается до старта
        userThread.start();
        daemonThread.start();


        System.out.println("Main thread ends");

    }
}

class UserThread extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " id daemon: "
        +isDaemon());
        for (char n = 'A'; n <= 'J' ; n++) {
            try {
                sleep(300);
                System.out.println(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " id daemon: "
                +isDaemon());
        for (int n = 1; n <= 1000 ; n++) {
            try {
                sleep(100);
                System.out.println(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
