package udemy.stream;

import java.util.Arrays;

public class Sorted5 {
    public static void main(String[] args) {
        int [] array = {3,4,2,100,5,3,7,35};
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));
        int result = Arrays.stream(array)
                .filter(x -> x % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                .reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);

    }
}
