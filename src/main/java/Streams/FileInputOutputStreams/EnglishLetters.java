package Streams.FileInputOutputStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnglishLetters {
    static int englishLetters=0;
    /*
    посчитать количество символов в файле, которые соответсвуют буквам английского алфавита
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader(MaxByte.file));
        while (reader.ready()) {
            String temp= reader.readLine();
            Pattern pattern = Pattern.compile("[A-Za-z]+");
            Matcher matcher = pattern.matcher(temp);
            while (matcher.find()) {
                englishLetters++;
            }
        }
        reader.close();
        System.out.println(englishLetters);
    }
}
