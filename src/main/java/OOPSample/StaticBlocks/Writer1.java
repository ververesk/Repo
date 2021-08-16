package OOPSample.StaticBlocks;

import java.io.*;

public class  Writer1 {
    public static void writeInFile(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FileCreator.file, false));
        StringBuilder stringBuilder = new StringBuilder();
        String s = "";
        while (true) {
            s=bufferedReader.readLine();
            if (s.equalsIgnoreCase("exit")) { break; }
            stringBuilder.append(s).append(System.lineSeparator());
        }
        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.close();
    }
}
