package Streams.WritersAndReaders;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader1 {
static List<Integer> integerList=new ArrayList<>();
    public static void readFromFile(File file) {
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
while (bufferedReader.ready()) {
           int i=Integer.parseInt(bufferedReader.readLine());
           if (i%2==0) {
               integerList.add(i);
           }
}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
