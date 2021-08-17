package Streams.FileInputOutputStreams;

import java.io.*;

public class FileSplitting {
    /*
    разделить файл1 так:первую половину байт записать в файл2, вторую - в файл3. Если в файл1 количество байт нечетное, то файл2 должен содержжать большую часть
     */
    static File file2= new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\test2.txt");
    static File file3= new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\test3.txt");

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(MaxByte.file);
        FileOutputStream outputStream=new FileOutputStream(file2);
        FileOutputStream outputStream3=new FileOutputStream(file3);
        System.out.println(inputStream.available()); //нечетное
        int middle=inputStream.available()/2;
while (inputStream.available()>middle-1) {
    int temp=inputStream.read();
    outputStream.write(temp);
}
while (inputStream.available()>0) {
    int temp=inputStream.read();
    outputStream3.write(temp);
}
inputStream.close();
outputStream.close();
outputStream3.close();
    }
}
