package Streams.FileInputOutputStreams;

import java.io.*;

public class TwoInOne {
    /*
    Считать три имени файла. Записать в первый файл содержимое второго файла,
    а потом дописать в первый файл содержимое третьего файла
     */
    static File file5= new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\test5.txt");
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream1 = new FileInputStream(FileSplitting.file2);
        FileInputStream inputStream2 = new FileInputStream(FileSplitting.file3);
        FileOutputStream outputStream=new FileOutputStream(file5, true);
        while (inputStream1.available()>0) {
            outputStream.write(inputStream1.read());
        }
        while (inputStream2.available()>0) {
            outputStream.write(inputStream2.read());
        }
        inputStream1.close();
        inputStream2.close();
        outputStream.close();

    }
}
