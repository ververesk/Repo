package TAsk54;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writer {
    public static void writeInFile(File file)  {
        try(FileWriter fileWriter=new FileWriter(file, false);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)) {
            for (int i = 0; i< NewArray.array.length; i++) {
                bufferedWriter.write(String.valueOf(NewArray.array[i]));
                bufferedWriter.write(" \tпишется потоком "+Thread.currentThread().getName());
                bufferedWriter.append('\n');
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
