package udemy.stream;

import java.util.Arrays;

public class Sorted5 {
    public static void main(String[] args) {
        int [] array = {3,4,2,100,5,3,7,35};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
