package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    public String getString() {
        System.out.println("Enter a string");
        String output = this.scanner.next();
        return output;
    }
    public String getString(String prompt) {
        System.out.printf("%s\n", prompt);
        String output = this.scanner.next();
        return output;
    }
    public boolean yesNo() {
        String testStr = getString("Input yes or no");
        return testStr.equalsIgnoreCase("yes") || testStr.equalsIgnoreCase("y");
    }
    public int getInt(int min, int max) {
        int finalOutput = 0;
        while (true) {
            int output = getInt("Input a number");
            if (output >= min && output <= max) {
                finalOutput = output;
                break;
            }
        }
        return finalOutput;
    }
    public int getInt(String prompt) {
        System.out.printf("%s\n", prompt);
        int output = this.scanner.nextInt();
        return output;
    }
    public double getDouble(double min, double max) {
        double finalOutput = 0;
        while (true) {
            double output = getDouble("Input a double");
            if (output >= min && output <= max) {
                finalOutput = output;
                break;
            }
        }
        return finalOutput;
    }
    public double getDouble(String prompt) {
        System.out.printf("%s\n", prompt);
        double output = this.scanner.nextDouble();
        return output;
    }

}
