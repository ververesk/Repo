package OOPSample.StaticBlocks;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    static File dir=new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\OOPSample\\StaticBlocks");
    static File file;

    public static void createSomeFile(File file) {
        FileCreator.file = new File(dir, "File1.txt");
        try {
            if (!FileCreator.file.createNewFile()) { //если файл такой уже есть, удаляем и заново записываем
                FileCreator.file.delete();
                FileCreator.file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
