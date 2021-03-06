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
//        getInteger(1, 10);
//        System.out.println(factorial());
        rollDice();
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
    public static long getLong(long min, long max) {
        long output = 0;
        Scanner aScanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Provide an integer input between %d and %d (inclusive):\t", min, max);
            long userInput = aScanner.nextLong();
            if (userInput >= min && userInput <= max) {
                output = userInput;
                break;
            };
            System.out.println("Incorrect Try Again.");
        };
        return output;
    };
    //calculate the factorial of a number ex 3! is 1 x 2 x 3
    public static long factorial() {
       long numToFactorial = getLong(1, 20);
       System.out.printf("You chose %d.\n", numToFactorial);
       long output = 1;
       for (int i = 1; i <= numToFactorial; i++) {
           output *= i;
       };
       return output;
    };
    //dice
    public static long rollDice() {
        Scanner bScanner = new Scanner(System.in);
        long output = 0;
        while (true) {
            System.out.printf("Input the number of sides each die has:\t");
            long userDiceInput = bScanner.nextLong();
            long die1Value = randomLong(1, userDiceInput);
            long die2Value = randomLong(1, userDiceInput);
            System.out.printf("Die 1 Value: %d\nDie 2 Value: %d\nRoll Value: %d\n", die1Value, die2Value, die1Value + die2Value);
            System.out.print("Would you like to roll again?");
            String rollAgain = bScanner.next();
            if (!rollAgain.equalsIgnoreCase("yes")) {
                output = die1Value + die2Value;
                break;
            };
        };
        return output;
    };
    public static long randomLong(long leftLimit, long rightLimit) {
        return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
    };
};
