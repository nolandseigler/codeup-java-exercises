package util;

public class InputTest {

    public static void main(String[] args) {
        Input myScanner = new Input();
        myScanner.yesNo();
        myScanner.getInt(myScanner.getInt(), myScanner.getInt());
        myScanner.getDouble(myScanner.getDouble(), myScanner.getDouble());
    }
}
