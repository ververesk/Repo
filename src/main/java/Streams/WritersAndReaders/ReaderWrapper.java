package Streams.WritersAndReaders;

import java.io.*;
import java.util.Locale;

public class ReaderWrapper {

    /*
    в методе main подменить system.out написанной ридер оберткой.
    Ридер обертка должен преобразовывать весь текст в заглавные буквы
     в printSomething1 распарсить пример и решить его.
     плюс записать ТЕКСТ ДЛЯ ТЕСТИНГА в файл
     */
    public static TestString string=new TestString();
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(ReplaceInFile.file2));
        PrintStream printStream=System.out;
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream1=new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2=new ByteArrayOutputStream();
        PrintStream newPrintSteam=new PrintStream(byteArrayOutputStream);
        PrintStream newPrintSteam1=new PrintStream(byteArrayOutputStream1);
        PrintStream newPrintSteam2=new PrintStream(byteArrayOutputStream2);
        System.setOut(newPrintSteam);
        string.printSomething();
        System.setOut(newPrintSteam1);
        string.printSomething1();
        System.setOut(newPrintSteam2);
        string.printSomething();
        System.setOut(printStream);
        String result=byteArrayOutputStream.toString().toUpperCase();
        System.out.println(result);
        String resultForNumber=byteArrayOutputStream1.toString();
        String [] strings=resultForNumber.split(" ");
        int firstNum=Integer.parseInt(strings[0]);
        int secondNum=Integer.parseInt(strings[2]);
        int arithmeticResult=0;
        if (strings[1].trim().equals("+")) {
            arithmeticResult=firstNum+secondNum;
        }
        System.out.println(arithmeticResult);
        bufferedWriter.write(byteArrayOutputStream2.toString());
        bufferedWriter.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("Текст для тестинга");
        }
        public void printSomething1() {
            System.out.println("3 + 6 = ");
        }
    }
}
