package Interrupt;

public class TestThread {
    public static void main(String[] args) throws InterruptedException{
        Test test=new Test();
        test.start();
        Thread.sleep(100);
        test.interrupt();

    }

    public static class Test extends Thread {
        public void run() {
int i = 0;
                while (!(Thread.currentThread().isInterrupted())) {

                    System.out.println("Привет"+(i++));
                }

        }

    }
}
