package Threads.Sleep;

import java.util.ArrayList;
import java.util.List;

public class Countdown {
    public static volatile List<String> list = new ArrayList<String>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Countdown1(3), "Countdown1");
        t.start();
    }

    public static class Countdown1 implements Runnable {
        private int countFrom;

        public Countdown1(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountDown();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void printCountDown() throws InterruptedException {

            countFrom--;
                System.out.println(list.get(countFrom));

                Thread.sleep(500);


        }
    }
}

