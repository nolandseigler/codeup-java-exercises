import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf(" %d ", i);
//            i++;
//        }
//        int j = 100;
//        do {
//            System.out.printf("%d \n", j);
//            j -= 5;
//        } while(j >= -10);
//        long k = 2;
//        do {
//            System.out.printf("%d \n", k);
//            k *= k;
//        } while (k < 1000000);
//        double k = 2;
//        do {
//            System.out.printf("%.0f \n", k);
//            k = Math.pow(k, 2);
//        } while (k < 1000000);
//        for (int i = 5; i <= 15; i++) {
//            System.out.printf(" %d ", i);
//        };
//        System.out.println('\n');
//        for (int j = 100; j >= -10; j -= 5) {
//            System.out.printf("%d \n", j);
//        };
//        System.out.print('\n');
//        for (long k = 2; k < 1000000; k *= k) {
//            System.out.printf("%d \n", k);
//        }
//        //FIZZ BUZZ
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.printf("%d \n", i);
//            }
//        }
        //Table of Powers
        Scanner aScanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("What number would you like to square and cube up to? ");
//            long inputLong = aScanner.nextLong();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (long i = 0; i <= inputLong; i++) {
//                System.out.printf("%d      | %d       | %d      \n", i, i * i, i * i * i);
//            }
//            System.out.print("Would you like to square and cube again?");
//            String inputString = aScanner.next();
//            if (!continueString.toLowerCase().equals("yes")) {
//                break;
//            }
//        }
//        //Grades Convert
        while (true) {
            System.out.print("Please input a numerical grade for letter assessment: ");
            int inputInt = aScanner.nextInt();
            if (inputInt >= 88) {
                if (inputInt >= 99) {
                    System.out.printf("A %d is an A+ \n", inputInt);
                } else {
                    System.out.printf("A %d is an A \n", inputInt);
                };
            } else if (inputInt >= 80) {
                if (inputInt >= 86) {
                    System.out.printf("A %d is a B+ \n", inputInt);
                } else {
                    System.out.printf("A %d is a B \n", inputInt);
                };
            } else if (inputInt >= 67) {
                if (inputInt >= 78) {
                    System.out.printf("A %d is a C+ \n", inputInt);
                } else {
                    System.out.printf("A %d is a C \n", inputInt);
                };
            } else if (inputInt >= 60) {
                if (inputInt >= 65) {
                    System.out.printf("A %d is a D+ \n", inputInt);
                } else {
                    System.out.printf("A %d is a D \n", inputInt);
                };
            } else if (inputInt >= 0) {
                System.out.printf("A %d is a F \n", inputInt);
            } else {
                System.out.printf("Your input was %d. Please input a number between 0 and 100. \n", inputInt);
            };
            System.out.print("Would you like to continue?");
            String continueString = aScanner.next();
            //String comparison is funny in Java
            if (!continueString.toLowerCase().equals("yes")) {
                break;
            }
        }
    }
}
