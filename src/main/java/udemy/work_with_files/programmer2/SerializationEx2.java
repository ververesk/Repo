package udemy.work_with_files.programmer2;

import udemy.work_with_files.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employee = null;
        try (
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))) {
            employee = (Employee) inputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(employee);
    }
}
