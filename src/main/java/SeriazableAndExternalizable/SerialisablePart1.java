package SeriazableAndExternalizable;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * сериализовать класс, пометить ненужные поля модификатором transient, написать код проверки
 */
public class SerialisablePart1 implements Serializable{
    private final transient String pattern="dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public SerialisablePart1(int temperature) {
        this.currentDate=new Date();
        this.temperature = temperature;
        string="Today is %s and the current temperature is %s C";
        SimpleDateFormat dateFormat=new SimpleDateFormat(pattern);
        this.string=String.format(string, dateFormat.format(currentDate), temperature);
    }

    public static void main(String[] args) {
        try (ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("ExternalisableSample.txt", false));
                ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("ExternalisableSample.txt"))) {
            SerialisablePart1 part2Saved=new SerialisablePart1(10);
            outputStream.writeObject(part2Saved);
            System.out.println(part2Saved);
            SerialisablePart1 other=new SerialisablePart1(-3);
            SerialisablePart1 loaded= (SerialisablePart1) inputStream.readObject();
            System.out.println(loaded);
            System.out.println(part2Saved.string.equals(loaded.string));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("ExternalisableSample.txt"))) {
            SerialisablePart1 other=new SerialisablePart1(-3);
            SerialisablePart1 loaded=(SerialisablePart1) inputStream.readObject();
            System.out.println(loaded);
        } catch (Exception e){
            e.printStackTrace();
        }

    }


    @Override
    public String toString() {
        return this.string;
    }

}
