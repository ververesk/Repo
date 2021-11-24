package udemy.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamEx {//не подходит когда действие зависит от очередности

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream()
                .reduce(Double::sum)
                .get();
        System.out.println("sumResult " + sumResult);

        double sumResultParallel = list.parallelStream()
                .reduce((a, e) -> a + e)
                .get();
        System.out.println("sumResultParallel " + sumResultParallel);

        double divisionResult = list.stream()
                .reduce((a, e) -> a / e)
                .get();
        System.out.println("divisionResult " + divisionResult);

        double divisionResultParallel = list.parallelStream()
                .reduce((a, e) -> a / e)
                .get();
        System.out.println("divisionResultParallel " + divisionResultParallel);
    }
}
