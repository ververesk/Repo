package Streams.FileInputOutputStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreadsAndBytes {
    /*
    читать с консоли имена файлов, пока не будет введено слово "exit".
    Передайте имя файла в нить ReadThread. Нить должна найти байт, который встречается в файле максимальное число раз
    и добавить его в словарь resultMap. Где параметр String - это имя файла, параметр Integer - это искомый файл
     */
    static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
            ReadThread readThread = new ReadThread(fileName);
            for (int i = 0; i < 4; i++) {
                Thread t = new Thread(readThread);
                t.setName("я поток номер " + i);
                t.setDaemon(false);
                t.start();
            }

        }
    }

    static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        public void run() {
            byte [] bytes=new byte[256];
            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                while (inputStream.available() > 0) {
                    int aByte = inputStream.read(); //считывает байт из файла, индекс элемента соответствует знач байта. а содержимое еоличеству повторений этого байта
                    bytes[aByte]++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            int maxCount=0;
            int maxCountByte=0;
            for (int i = 0; i < bytes.length; i++) {
                if(bytes[i]>maxCount) {
                    maxCount=bytes[i];
                    maxCountByte=i;
                }
            }
            resultMap.put(fileName, maxCountByte);
            System.out.println(Arrays.asList(resultMap)+"Имя потока: "+Thread.currentThread().getName());
        }

    }
}
