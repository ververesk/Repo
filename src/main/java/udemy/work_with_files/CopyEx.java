package udemy.work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }

            String lines;
            while((lines= reader.readLine())!=null) {
                writer.write(lines);
                writer.write('\n');
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
