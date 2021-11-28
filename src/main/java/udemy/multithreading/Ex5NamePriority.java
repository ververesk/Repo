package udemy.multithreading;

public class Ex5NamePriority {
    public static void main(String[] args) { //10 наивысший приоритет, но он необязательно запуститься первым
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("My thread");
        myThread5.setPriority(9);
       // myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("name myThread5: " + myThread5.getName() +
                ", Priority myThread5 =  " + myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        System.out.println("name myThread6: " + myThread6.getName() +
                ", Priority myThread6 =  " + myThread6.getPriority());
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}
