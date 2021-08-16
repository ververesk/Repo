package OOPSample.StaticBlocks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RunnerForFiles {
    public static List<String> lines=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        FileCreator.createSomeFile(FileCreator.file);
        Writer1.writeInFile(FileCreator.file);
        System.out.println(lines);
    }
    static {
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(Statics.FILE_NAME));
            while (bufferedReader.ready()) {
                lines.add(bufferedReader.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
