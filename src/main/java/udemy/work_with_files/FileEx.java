package udemy.work_with_files;

import java.io.File;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("test2.txt");
        File folder = new File("C:\\Users\\WorkBook\\Downloads");
        System.out.println("file.getAbsolutePath() " + file.getAbsolutePath());
        System.out.println("file.isAbsolute() " + file.isAbsolute());
        System.out.println("folder.isAbsolute() " + folder.isAbsolute());
        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("folder.isDirectory() " + folder.isDirectory());
        System.out.println("file.length() " + file.length());
        System.out.println("folder.length() " + folder.length());
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("file.canWrite() " + file.canWrite());
        System.out.println("file.canExecute() " + file.canExecute());
        System.out.println("file.canRead() " + file.canRead());

    }
}
