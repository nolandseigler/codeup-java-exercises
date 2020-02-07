package util;

import java.sql.SQLOutput;

public class InputTest {

    public static void main(String[] args) {
//        System.out.println("Start");
        Input myScanner = new Input();
////        System.out.println("Start yesNO");
//        System.out.println(myScanner.yesNo());
////        System.out.println("Start getInt");
//        System.out.println(myScanner.getInt(myScanner.getInt("Input a min number."), myScanner.getInt("Input a max number.")));
////        System.out.println("Start getDouble");
//        System.out.println(myScanner.getDouble(myScanner.getDouble("Input a min double"), myScanner.getDouble("Input a max double.")));
////        System.out.println("End");
        System.out.println(myScanner.getBinary("Input a binary number (base 2) to convert to decimal (base 10)."));
        System.out.println(myScanner.getHex("Input a hexadecimal number (base 16) to convert to decimal (base 10)."));
    }
}
