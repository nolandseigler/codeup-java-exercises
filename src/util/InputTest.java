package util;

import java.sql.SQLOutput;

public class InputTest {

    public static void main(String[] args) {
        System.out.println("Start");
        Input myScanner = new Input();
        System.out.println("Start yesNO");
        System.out.println(myScanner.yesNo());
        System.out.println("Start getInt");
        System.out.println(myScanner.getInt(myScanner.getInt(), myScanner.getInt()));
        System.out.println("Start getDouble");
        System.out.println(myScanner.getDouble(myScanner.getDouble(), myScanner.getDouble()));
        System.out.println("End");
    }
}
