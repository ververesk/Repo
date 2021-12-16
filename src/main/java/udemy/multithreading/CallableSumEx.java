package udemy.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * надо посчитать сумму чисел от 1 до миллиарда. но счиать будем отдельно суммы.
 * то есть от 1 до 100_000_000
 * потом от100_000_001 до 2_000_000
 * и т д а потом полученные суммы сложим друг с другом
 */
public class CallableSumEx {
    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futures = new ArrayList<>();
        long valueDividedByTen = value/10;
        for (int i = 0; i < 10; i++) {
            long from = valueDividedByTen*i+1;
            long to = valueDividedByTen*(i+1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartSum = executorService.submit(task);
            futures.add(futurePartSum);
        }
    //  executorService.shutdown();
        for (Future<Long>result: futures) {
            sum+=result.get();
        }
        executorService.shutdown();
        System.out.println("total sum = "+sum);
    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        for (long i = from; i <= to; i++) {
            localSum+=i;
        }
        System.out.println("sum from "+from+" to"+to+" = "+localSum);
        return localSum;
    }
}