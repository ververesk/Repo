package udemy.multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt(); //main хочет прервать поток thread
        thread.join(); // main будет ждать пока thread завершить работу
        System.out.println("Main thread ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()) {  //возвращается true если какой то другой поток хочет прервать наш поток
                System.out.println("поток хотят прервать"); /*
                мы сами решаем что делать если наш поток хотят прервать, можем и не прерывать работу
                */
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("поток хотят прервать во время сна, давайте завершим его работу");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}