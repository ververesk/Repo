package TAsk54;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ThirdThread implements Runnable {
    @Override
    public void run() {
        try {
            CreateFiles.file=new File(CreateFiles.dir, "Task54.txt");
            CreateFiles.file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        NewArray.array=new Random()
                .ints(10,0,100)
                .toArray();
        Writer.writeInFile(CreateFiles.file);
        System.out.println("Работает поток "+Thread.currentThread().getName());
    }
}

