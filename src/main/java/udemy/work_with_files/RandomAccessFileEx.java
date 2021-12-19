package udemy.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try(RandomAccessFile accessFile = new RandomAccessFile("test10.txt", "rw")) {
            int a = accessFile.read();
            System.out.println((char)a);
            String s1 = accessFile.readLine();
            System.out.println(s1);
            accessFile.seek(101); //перемещаем курсов на 101 позицию
            String s2 = accessFile.readLine();
            System.out.println(s2);
            long filePointer = accessFile.getFilePointer();//возвращает позицию где находится курсов
            System.out.println(filePointer);
            accessFile.seek(accessFile.length()-1); //чтобы записать в конец
            accessFile.writeBytes("\nRobert Frost");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
