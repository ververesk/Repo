package udemy.work_with_files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test11.txt");
//        Files.createFile(filePath);
//        String dialog = "-Hello\n-Hello\n-How are you?\n-Fine!\n-And you?\n-Great!";
//        Files.write(filePath, dialog.getBytes(StandardCharsets.UTF_8));
        //читаем диалог
        List<String> list = Files.readAllLines(filePath);
        for(String s : list) {
            System.out.println(s);
        }
    }
}
