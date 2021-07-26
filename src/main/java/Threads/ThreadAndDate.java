package Threads;

import java.util.Date;

public class ThreadAndDate {
    public static int delay=1000;

    public static void main(String[] args) {
        Thread violin=new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds (int n) {
        try {
            Thread.sleep(n*delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();
        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        String owner;


        public Violin(String owner) {
            this.owner = owner;
        }

        @Override
        public Date startPlaying() {
            System.out.println(this.owner+ " is starting to play");
            return new Date();
        }

        @Override
        public Date stopPlaying() {
            System.out.println(this.owner+ " is stopping to play");
            return new Date();
        }

        @Override
        public void run() {
            Date start=startPlaying();
            ThreadAndDate.sleepNSeconds(2);
            Date finish=stopPlaying();
            System.out.println("Playing "+ (finish.getTime()-start.getTime())+" ms");

        }
    }

}
