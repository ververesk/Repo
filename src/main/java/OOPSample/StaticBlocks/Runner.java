package OOPSample.StaticBlocks;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

    }
    static {
reset();
    }
    public static CanFly result;
    public static void reset() {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if (str.equalsIgnoreCase("helicopter")) {
            result=new Helicopter();
        } if (str.equalsIgnoreCase("plane")) {
            result=new Plane(20);
        }

    }
}
