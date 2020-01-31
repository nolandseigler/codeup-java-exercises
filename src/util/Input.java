package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    Input() {
        this.scanner = new Scanner(System.in);
    }
    String getString() {
        String output = scanner.next();
        return output;
    }
    boolean yesNo() {
        if (getString().equalsIgnoreCase("yes") || getString().equalsIgnoreCase("y") ) {
            return true;
        } else {
            return false;
        }
    }
    int getInt(int min, int max) {
        int finalOutput = 0;
        while (true) {
            int output = getInt();
            if (output >= min && output <= max) {
                finalOutput = output;
                break;
            }
        }
        return finalOutput;
    }
    int getInt() {
        System.out.println("Input a number.");
        int output = scanner.nextInt();
        return output;
    }
    double getDouble(double min, double max) {
        double finalOutput = 0;
        while (true) {
            int output = getInt();
            if (output >= min && output <= max) {
                finalOutput = output;
                break;
            }
        }
        return finalOutput;
    }
    double getDouble() {
        System.out.printf("Input a number double.");
        double output = scanner.nextDouble();
        return output;
    }

}