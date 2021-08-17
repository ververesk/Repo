package Streams.FileInputOutputStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ByteSort {
    /*
    считать все байты из файла. Не учитывая повторений, отсортировать из по байт коду в возрастающем порядке
    ещё ищем кол-во запятых в файле
     */
    static Set<Integer> set = new TreeSet<Integer>();

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(MaxByte.file);
        int comaCount=0;
        while (inputStream.available() > 0) {
            if(inputStream.read()==44) {
                comaCount++;
            }
            set.add(inputStream.read());
        }
        inputStream.close();
        set.forEach(System.out::println);
        System.out.println("Количество запятых в доке "+comaCount);
    }
}
