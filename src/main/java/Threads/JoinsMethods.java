package Threads;

public class JoinsMethods {
    public static void main(String[] args) {
        Cat cat1=new Cat("Мурка");
        Cat cat2=new Cat("Машка");
    }

    private static void investigateWorld() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
    }
    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            this.kitten1 = new Kitten("Котенок 1 "+"Мама "+getName());
            this.kitten2 = new Kitten("Котенок 2 "+"Мама "+getName());
            start();
        }

        public void run() {
            System.out.println(getName()+" родила 2 котят");
            try {
                initAllKittens();
                kitten1.join();
                kitten2.join();
            } catch (InterruptedException e) {
            }
            System.out.println(getName()+" : все котята в корзинке. "+getName()+" собрала их назад");
        }

        private void initAllKittens() throws InterruptedException{
            kitten1.start();
            kitten2.start();
        }
    }

    public static class Kitten extends Thread {

        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName()+ " вылез из корзинки");
            investigateWorld();

        }
    }
}
