package Streams.InputAndOuputStream.SortEvenNumbersFromFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Writer1 {
    public static void writeInFile(File file) {

        try(FileWriter fileWriter=new FileWriter(file, true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)) {
//            List<Integer> list = new Random().ints(10, 1, 100).boxed().collect(Collectors.toList());
//            for (Integer integer : list) {
                bufferedWriter.write(1);



            }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
