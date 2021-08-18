package Streams.FileInputOutputStreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoundingNumbers {
    /*
    файл6 содержит вещественные (дробные) числа, разделенные пробелом. Например, 1.234. Округлить числа до целых и записать
    через пробел во второй файл(файл7).
     */
    static File file6=new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\test6.txt");
    static File file7=new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\test7.txt");
    static List<Integer> integerList=new ArrayList<Integer>();

    public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(file6));
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file7))) {
            while (bufferedReader.ready()) {
                String [] strings=bufferedReader.readLine().split(" ");
for (String s: strings) {
    double d=Double.parseDouble(s);
    int j=(int)Math.round(d);
    bufferedWriter.write(String.valueOf(j)+"\t");
}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        }
    }



