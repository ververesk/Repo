package Interrupt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stopwath {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите что угодно");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(in);
        Stopwath1 stopwath1=new Stopwath1();
        stopwath1.start();
        reader.readLine();
        stopwath1.interrupt();
        reader.close();
        in.close();
    }

    public static class Stopwath1 extends Thread {
        int second;

        public void run() {


            try {
                while(!(Thread.currentThread().isInterrupted())) {
                    second++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(second);
            }
        }
    }
}

