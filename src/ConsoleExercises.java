import java.util.*;
import java.lang.*;
public class ConsoleExercises {

    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f \n", pi);
//        //Make a scanner;
        Scanner aScanner = new Scanner(System.in);
//        //
//        //Ask for an int and capture it with scanner
//        System.out.print("Enter an integer: ");
//        int userInputInt = aScanner.nextInt();
//        //
//        //Prompt user for 3 words and store each in a seperate variable. then display them.
//        System.out.print("Enter three words: ");
//        String userInputStr1 = aScanner.next();
//        String userInputStr2 = aScanner.next();
//        String userInputStr3 = aScanner.next();
//        System.out.printf("%s\n%s\n%s\n", userInputStr1, userInputStr2, userInputStr3);
//        //
//        //Prompt user to enter a sentence. capture it in string using next then display
//        System.out.print("Enter a sentence: ");
//        String userInputSentStr = aScanner.next();
//        System.out.printf("%s\n", userInputSentStr);
//        //
        //if you dont comment out the code above it continues into the nextLine capture;
        //Rewritten with nextLine();
//        System.out.print("Enter a sentence: ");
//        String userInputSentStr2 = aScanner.nextLine();
//        System.out.printf("%s\n", userInputSentStr2);
        //Console IO exercise
        System.out.print("Enter the values of the length, width, and height of your classroom at Codeup: ");
        String inputStrLengthAndWidth = aScanner.nextLine();
        String[] strArr = inputStrLengthAndWidth.split(" ");
        double length = Double.parseDouble(strArr[0]);
        double width = Double.parseDouble(strArr[1]);
        double height = Double.parseDouble(strArr[2]);
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        double volume = length * width * height;
        System.out.printf("%s\n", inputStrLengthAndWidth);
        System.out.printf("The area of the classroom is: %.2f.\n", area);
        System.out.printf("The perimeter of the classroom is: %.2f.\n", perimeter);
        System.out.printf("The volume of the classroom is: %.2f.\n", volume);
        //
        //Console IO Exercise refactor bonus
        System.out.print("Enter the length, width and height of your classroom: ");
//        //uses space delimiter. I dont like it. use .nextLine if you want this
//        aScanner.useDelimiter("\n");
//        String useDelimOutput = aScanner.next();
//        System.out.printf("%s", useDelimOutput);
        int lengthBonus = aScanner.nextInt();
        int widthBonus = aScanner.nextInt();
        int heightBonus = aScanner.nextInt();
        int areaBonus = lengthBonus * widthBonus;
        int perimeterBonus = (lengthBonus * 2) + (widthBonus * 2);
        int volumeBonus = lengthBonus * widthBonus * heightBonus;
        System.out.printf("The area of the classroom is: %d.\n", areaBonus);
        System.out.printf("The perimeter of the classroom is: %d.\n", perimeterBonus);
        System.out.printf("The volume of the classroom is: %d.\n", volumeBonus);


    }
}
