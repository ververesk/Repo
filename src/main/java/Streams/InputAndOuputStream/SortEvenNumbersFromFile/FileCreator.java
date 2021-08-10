package Streams.InputAndOuputStream.SortEvenNumbersFromFile;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    static File dir=new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\InputAndOuputStream\\SortEvenNumbersFromFile");
    static File file;

    public static void createSomeFile (File file) {
        try {
            file = new File(dir, "FileWithNumbers.txt");
            if (!file.createNewFile()) { //если файл такой уже есть, удаляем и заново записываем
                file.delete();
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

