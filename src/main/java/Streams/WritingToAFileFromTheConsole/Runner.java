package Streams.WritingToAFileFromTheConsole;

import java.io.*;
//прочесть с консоли имя файла. Считывать с консоли строки, пока не введено exit. Записать все строки в файл
public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, false));
        StringBuilder stringBuilder = new StringBuilder();
        String s = "";
        while (!s.equalsIgnoreCase("exit")) {
            s=bufferedReader.readLine();
            stringBuilder.append(s).append(System.lineSeparator());
        }
        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.close();

    }
}
