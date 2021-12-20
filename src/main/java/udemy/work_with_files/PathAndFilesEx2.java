package udemy.work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path filePath6 = Paths.get("test6.txt"); //для начала здесь надо этот файл создать чтобы перемещать
        Path directoryPath = Paths.get("C:\\Users\\WorkBook\\Downloads");
//        Files.copy(filePath,directoryPath.resolve(filePath)
//        , StandardCopyOption.REPLACE_EXISTING); //если такой файл уже есть его надо заменить

  //      Files.copy(filePath,directoryPath.resolve("test16.txt"));
        Files.move(filePath6, directoryPath.resolve("test6.txt"));
 //       Files.move(Paths.get("test10"), (Paths.get("test10"))); переместится и переименуется
    }
}
