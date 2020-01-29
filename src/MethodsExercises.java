import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(Addition(2, 2));
//        System.out.println(Subtraction(2, 2));
//        System.out.println(Multiplication(2, 2));
//        System.out.println(Division(2, 2));
//        System.out.println(Modulus(2, 2));
//        System.out.println(noStar(2, 4));
//        System.out.println(recursioniply(2, 5));
        getInteger(1, 10);
    };
    public static double Addition (double num1, double num2) {

        return num1 + num2;
    };
    public static double Subtraction (double num1, double num2) {

        return num1 - num2;
    };
    public static double Multiplication (double num1, double num2) {

        return num1 * num2;
    };
    public static double Division (double num1, double num2) {

        return num1 / num2;
    };
    public static double Modulus (double num1, double num2) {

        return num1 % num2;
    };
    //bonus multiply without *
    public static double noStar (double num1, double num2) {
        double output = 0;
        for(int i = 1; i <= num2; i++) {
            output += num1;
        };
        return output;
    };
    //bonus multiply with without * using recursion
    public static double recursioniply (double num1, double num2) {
        double output = 0;
        double i = 0;
        while(i < num2) {
            output += num1;
//            System.out.println("layer" + i);
            recursioniply(num1, num2 -1);
            i++;
        }
        return output;
    };
    //validate input is in a range
    public static int getInteger(int min, int max) {
        int output = 0;
        Scanner aScanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Provide an integer input between %d and %d\t", min, max);
            int userInput = aScanner.nextInt();
            if (userInput >= min && userInput <= max) {
                output = userInput;
                break;
            };
        };
        return output;
    };

};
