package Streams.RandomAccessFileSample;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * запись text в файл начиная с позиции number. Запись производится поверх старых данных в файле.
 * если файл слишком короткий, записать в конец файла
 */
public class Sample1 {
    static long number=100;
    static String text="STRING";

    static File file=new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\test1.txt");
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            if (number<=file.length()) {
                raf.seek(number);
            } else {
                raf.seek(file.length());
            }
            raf.writeBytes(text);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
