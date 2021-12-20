package udemy.work_with_files;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {
    public static void main(String[] args) {
        try (RandomAccessFile accessFile = new RandomAccessFile("test5.txt", "r");
             FileChannel channel = accessFile.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.rewind(); //поместит курсор на ячейку 0
            System.out.println((char) buffer.get()); //a
            System.out.println("______________________________");
            buffer.compact(); //поместит курсор на ячейку на 0 но если есть какие то уже записанные элементы в буффер он их не сотрет
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            System.out.println("______________________________");
            buffer.clear();
            channel.read(buffer); //по f включительно прочитано, чтение начнется с g
            buffer.flip();
            System.out.println((char) buffer.get()); //g
            buffer.mark(); //а на позиции h мы поставили отметку
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset(); //возвращаемся на позицию где стоит отметка то есть на h
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
