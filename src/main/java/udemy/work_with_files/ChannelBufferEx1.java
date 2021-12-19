package udemy.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile accessFile = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = accessFile.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25); //25 максимальная емкость сделали меньше чем размер файла
            StringBuilder builder = new StringBuilder();
            int read = channel.read(buffer); //читаем инф из channel и сразу записываем в buffer. за один раз весь стих не уместится
            while (read>0) {
                System.out.println("Прочитано "+read);
                buffer.flip(); //меняет режим буфера из записи в чтение
                while (buffer.hasRemaining()) { //пока у buffer есть что читать
                    builder.append((char)buffer.get());
                }
                buffer.clear();
                read = channel.read(buffer);
            }
            System.out.println(builder);
            String text = "\nMany of life's failures are people who did not realize \nhow close they were to success when they gave up.";
            //1 вариант
//            ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes().length); //создали буфер длиной текста
//            buffer1.put(text.getBytes(StandardCharsets.UTF_8)); //занесли цитату в буфер
//            buffer1.flip();
//            channel.write(buffer1);
//2 вариант
            ByteBuffer buffer1 = ByteBuffer.wrap(text.getBytes(StandardCharsets.UTF_8));
            channel.write(buffer1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
