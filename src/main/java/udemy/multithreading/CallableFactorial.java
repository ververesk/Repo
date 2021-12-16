package udemy.multithreading;

import java.util.concurrent.*;

/**
 * можно использовать только ExecutorService, просто Thread нельзя
 */
public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial = new Factorial2(6);
        Future<Integer> future = executorService.submit(factorial); //результат хранится в Future
        try {
            System.out.println(future.isDone());
            System.out.println("Хотим получить результат");
            factorialResult = future.get();
            System.out.println("получили результат");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);

    }
}

class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f<=0) {
            throw new Exception("bad number");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            Thread.sleep(1000);
            result*=i;
        }
       return result;
    }
}
