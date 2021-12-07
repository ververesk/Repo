package udemy.multithreading;

/**
 * есть моб связь, скайп, ватсапп. Нам могут звонить по моб связи, скайпу и ватсаппу
 * будут три разных ответственные за звонки с разных каналов
 * правило: если мы разговариваем используя любой их этих каналов, и нам приходит ещё звонок
 * то этот звонок будет ждать пока не закончится текущий
 */
public class Ex12Synch {
    /*
    synchronized по умолчанию если методы не статичные делает синхронизацию на объекте, а объекты тут три разных
     */
    static final Object lock = new Object();

    //   synchronized void mobileCall() {
    void mobileCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    // synchronized void skypeCall() {
    void skypeCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype call ends");
        }
    }

    // synchronized void whatsappCall() {
    void whatsappCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("whatsapp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("whatsapp call ends");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableImplMobile());
        Thread t2 = new Thread(new RunnableImplSkype());
        Thread t3 = new Thread(new RunnableImplWhatsapp());
        t1.start();
        t2.start();
        t3.start();
    }
}

class RunnableImplMobile implements Runnable {

    @Override
    public void run() {
        new Ex12Synch().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {

    @Override
    public void run() {
        new Ex12Synch().skypeCall();
    }
}

class RunnableImplWhatsapp implements Runnable {

    @Override
    public void run() {
        new Ex12Synch().whatsappCall();
    }
}

