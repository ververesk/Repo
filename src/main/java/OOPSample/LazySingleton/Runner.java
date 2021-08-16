package OOPSample.LazySingleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {

    }
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Planet thePlanet;
    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str=bufferedReader.readLine();
        if (str.equalsIgnoreCase(Planet.SUN)) {
            thePlanet=Sun.getInstance();
        } else if(str.equalsIgnoreCase(Planet.MOON)) {
            thePlanet=Moon.getInstance();
        } else if (str.equalsIgnoreCase(Planet.EARTH)) {
            thePlanet=Earth.getInstance();
        } else thePlanet=null;
    }
}
