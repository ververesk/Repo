package Streams.WritersAndReaders;

public class Runner {
    //записать в текстовый файл 10 случайных чисел, потом прочитать из файла, в консоль вывести только четные
    public static void main(String[] args) {
        FileCreator.createSomeFile(FileCreator.file);
        Writer1.writeInFile(FileCreator.file);
        Reader1.readFromFile(FileCreator.file);
       Reader1.integerList.forEach(System.out::println);
    }
}
