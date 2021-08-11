package Threads.Sleep;

public class Clocks {
    public static volatile boolean isStopped=false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock=new Clock();
        Thread.sleep(2000);
        isStopped=true;
        System.out.println("Часы остановлены");
        Thread.sleep(2000);
        System.out.println("Double-check");

    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            while (!isStopped) {
                try {
                    printTikTak();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printTikTak() throws InterruptedException {
            Thread.sleep(1000);
            System.out.println("Tik");
            Thread.sleep(1000);
            System.out.println("Tak");


        }

    }
}
