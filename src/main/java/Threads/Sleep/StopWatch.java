package Threads.Sleep;

public class StopWatch {
    public static volatile boolean isStopped=false;

    public static void main(String[] args) throws InterruptedException {
        Runner ivanov=new Runner("Ivanov",4);
        Runner petrov=new Runner("Petrov",2);
        ivanov.start();
        petrov.start();
        Thread.sleep(2000);
        isStopped=true;
        Thread.sleep(2000);
    }

    public static class Stopwatch1 extends Thread {
        protected Runner owner;
        protected int stepNumber;

        public Stopwatch1(Runner owner) {
            this.owner = owner;
        }

        public void run()
        { try {
            while (!isStopped) {
                doStep();
        }
            } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

            public void doStep() throws InterruptedException {
            stepNumber++;
            Thread.sleep(1000/owner.getSpeed());
                System.out.println(owner.getName()+ " делает шаг №"+stepNumber);
        }

    }

    public static class Runner {
        Stopwatch1 stopwatch1;
        public String name;
        public int speed;

        public Runner(String name, int speed) {
            this.stopwatch1 = new Stopwatch1(this);
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }
        public void start() {
            stopwatch1.start();
        }
    }
}
