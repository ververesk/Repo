package udemy.work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
чтобы перезаписывать картинки например
 */
public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream =
                     new FileInputStream("C:\\Users\\WorkBook\\Downloads\\zvezdnoe_nebo_mlechnyj_put_zvezdy_noch_118495_3840x2160.jpg");
             FileOutputStream outputStream = new FileOutputStream("zvezdy_noch.jpg")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
