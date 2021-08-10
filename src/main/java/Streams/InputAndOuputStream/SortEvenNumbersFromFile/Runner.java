package Streams.InputAndOuputStream.SortEvenNumbersFromFile;

public class Runner {
    public static void main(String[] args) {
        FileCreator.createSomeFile(FileCreator.file);
        Writer1.writeInFile(FileCreator.file);
    }
}
