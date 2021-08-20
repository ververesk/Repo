package Streams.Adapter;

import java.io.*;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Runner {
    static File file=new File("D:\\Вероника\\GIT папка\\Repo\\src\\main\\java\\Streams\\Adapter\\PersonInfo.txt");

    public static void main(String[] args) throws IOException, ParseException {
        PersonScanner personScanner=new PersonScannerAdapter(new Scanner(new FileInputStream(file)));
        System.out.println(personScanner.read().toString());


    }
    public static class PersonScannerAdapter implements PersonScanner {
private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
                String str = this.fileScanner.nextLine();
                String[] strings = str.split(" ");
                GregorianCalendar gregorianCalendar=new GregorianCalendar(Integer.parseInt(strings[5]),Integer.parseInt(strings[4])-1,Integer.parseInt(strings[3]));
                Date date=gregorianCalendar.getTime();
                Person person = new Person(strings[0], strings[1], strings[2], date);
                return person;
            }


        @Override
        public void close() throws IOException {
            this.fileScanner.close();

        }
    }
}
