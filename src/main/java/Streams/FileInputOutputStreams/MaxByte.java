package Streams.FileInputOutputStreams;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MaxByte {
    /*найти максимальный байт в файле
     *вывести его на экран
     */
    static File file= new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\test1.txt.txt");

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream=new FileInputStream(file);
        int maxByte=0;
        while (inputStream.available()>0) {
            int i=inputStream.read();
            if (i>maxByte) {
                maxByte=i;
            }
        }
        inputStream.close();
        System.out.println("Максимальный байт "+maxByte);
    }
}
