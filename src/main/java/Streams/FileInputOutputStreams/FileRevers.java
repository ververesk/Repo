package Streams.FileInputOutputStreams;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileRevers {
    static File file4= new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\test4.txt");
    static List<Integer> integerList=new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(MaxByte.file);
        FileOutputStream outputStream=new FileOutputStream(file4);
        while (inputStream.available()>0) {
            integerList.add(inputStream.read());
        }
            Collections.reverse(integerList);
            for (Integer integer: integerList) {
                outputStream.write(integer);
            }

        inputStream.close();
        outputStream.close();
    }
}
