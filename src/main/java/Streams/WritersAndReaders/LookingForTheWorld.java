package Streams.WritersAndReaders;



import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LookingForTheWorld {
    static File file = new File("D:\\Моя репа\\Repo\\src\\main\\java\\Streams\\WritersAndReaders\\FileWithWorld.txt");
    public static int count;


    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()) {
            Pattern pattern = Pattern.compile("world", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(bufferedReader.readLine());
            while (matcher.find()) {
                count++;
            }


            bufferedReader.close();
            System.out.println(count);

        }
    }
}
