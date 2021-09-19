package Streams.StringWriterAndReader;

import java.io.*;

/**
 * вернуть стринг врайтер содержащий данные из переданного потока
 */
public class Sample1 {
    static File file1 = new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\test1.txt");

    public static void main(String[] args) throws FileNotFoundException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream(file1));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) {
        StringWriter writer = new StringWriter();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            int n;
while ((n=bufferedReader.read())!=-1) {
    writer.write(n);
}
        } catch (Exception e) {
            e.printStackTrace();
        } return writer;
    }
}
