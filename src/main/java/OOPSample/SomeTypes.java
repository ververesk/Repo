package OOPSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomeTypes {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while (!(key=bufferedReader.readLine()).equalsIgnoreCase("exit")) {
            try {
                if (key.contains(".")) {
                    print(Double.parseDouble(key));
                } else {
                    int i = Integer.parseInt(key);
                    if (i > 0 && i < 128) {
                        print((short) i);
                    } else {
                        print(i);
                    }
                }
            }
         catch(Exception e){
            print(key);
        }
            bufferedReader.close();
    }


    }
    public static void print(Double value) {
        System.out.println("Это тип Double, значение "+value);
    }
    public static void print(String value) {
        System.out.println("Это тип String, значение "+value);
    }
    public static void print(short value) {
        System.out.println("Это тип short, значение "+value);
    }
    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение "+value);
    }
}
