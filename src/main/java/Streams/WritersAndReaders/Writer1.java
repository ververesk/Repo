package Streams.WritersAndReaders;

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
            int [] array=new Random()
                .ints(10,0,100)
                .toArray();
            for (int i = 0; i < array.length; i++) {
                bufferedWriter.write(String.valueOf(array[i]));
                bufferedWriter.write(System.lineSeparator());
            }
            }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
