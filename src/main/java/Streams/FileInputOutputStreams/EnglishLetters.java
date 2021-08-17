package Streams.FileInputOutputStreams;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnglishLetters {
    static int englishLetters=0;
    /*
    посчитать количество символов в файле, которые соответсвуют буквам английского алфавита
     */
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("[A-Za-z]+");
        Matcher matcher=pattern.matcher("");
        while (matcher.find()) {
            englishLetters++;
        }
    }
}
