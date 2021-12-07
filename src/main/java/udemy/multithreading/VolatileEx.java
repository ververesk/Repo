package udemy.multithreading;

public class VolatileEx extends Thread {
    volatile boolean b = true;
//volatile переменные хранятся в основной памяти
    //работает только в том случае когда один поток может изменять её значение а остальные только читать
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("finish, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx volatileEx = new VolatileEx();
        volatileEx.start();
        Thread.sleep(2000); //sleep для потока main, чтобы volatileEx поработал 3 секунды
        System.out.println("через 2 секунды время проснуться");
        //поток main меняет значение переменной
        volatileEx.b = false;
        volatileEx.join();
        System.out.println("Конец программы");
    }
}
