package Streams.WritersAndReaders;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    static File dir=new File("D:\\Моя репа\\Repo\\src\\main\\java\\Streams\\WritersAndReaders");
    static File file;

    public static void createSomeFile(File file) {
        try {
            FileCreator.file = new File(dir, "FileWithNumbers.txt");
            if (!FileCreator.file.createNewFile()) { //если файл такой уже есть, удаляем и заново записываем
                FileCreator.file.delete();
                FileCreator.file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

