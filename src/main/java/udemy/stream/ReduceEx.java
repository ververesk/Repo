package udemy.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceEx {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        integers.add(3);
        integers.add(8);
        integers.add(1);
        integers.add(4);
        integers.add(10);

        int result = integers.stream()
                .reduce((accumulator, element) -> //типа как запись res*=res
        accumulator*element).get();
        System.out.println(result);
        //3 8 1 4 10
        //accumulator = 3 (3*8=24) (24*1=24) (24*4=96) (96*10=960)
        //element = 8 1 4 10

        int result2 = integers.stream()
                .reduce(1, (accumulator, element) -> //1 начальное значение
                        (accumulator*element));
        System.out.println(result2);

        //3 8 1 4 10
        //accumulator = 1 (1*3=3) (3*8=24) (24*1) и  тд
        //element = 3 8 1 4 10

        List<String> strings=new ArrayList<>();
        strings.add("cat");
        strings.add("dog");
        strings.add("table");
        strings.add("meow");

        String result3 = strings.stream() //контактенация строк
                .reduce((a,e) -> a+" "+e).get();
        System.out.println(result3);

        List<Integer> list= new ArrayList<>(); //пустой лист
        Optional<Integer> optional = list.stream()
                .reduce((accumulator, element) ->
                        accumulator*element);
        if(optional.isPresent()) {
            System.out.println(optional.get());
        } else
        {
            System.out.println("Not present");
        }
    }
}
