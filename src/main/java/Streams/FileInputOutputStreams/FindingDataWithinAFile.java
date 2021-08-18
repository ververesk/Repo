package Streams.FileInputOutputStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FindingDataWithinAFile {
    /*
    Файл содержит английский текст. Посчитать частоту встречания каждого символа. Отсортировать
    результат по возрастанию кода ASCII
     */
    static File file7=new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\test8English.txt");

    public static void main(String[] args) {
       String s;
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(file7))) {
            while ((s=bufferedReader.readLine())!=null) {
                if(s.startsWith("Queen"))
                    System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        }
    }

