package Streams.WritersAndReaders;

import java.io.*;


public class ReplaceInFile {
    static File file2=new File("D:\\Моя репа\\Repo\\src\\main\\java\\Streams\\test1.txt");
    static File file = new File("D:\\Моя репа\\Repo\\src\\main\\java\\Streams\\WritersAndReaders\\FileWithWorld.txt");
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));

        while (bufferedReader.ready()) {

            String s=bufferedReader.readLine();
            bufferedWriter.write(s.replace(",", " ура"));
        }



        bufferedReader.close();
        bufferedWriter.close();

    }
}
