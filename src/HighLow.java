import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        System.out.println("A pseudorandom number between 1 and 100 has been generated.");
        guessNumber(randomNumber());
    };
    public static int randomNumber() {
        return (int) (Math.random() * 100) + 1;
    };
    public static int guessNumber(int correctNumber) {
        int output = 0;
        int takenGuesses = 0;
        int remainingGuesses = 10;
        Scanner aScanner = new Scanner(System.in);
        while (true) {
            if (remainingGuesses == 0) {
                System.out.println("You have run out of guesses. Thanks for playing");
                break;
            }
            System.out.printf("You have used %d guesses. You have %d guesses remaining. Guess the number:\t", takenGuesses, remainingGuesses);
            int userInput = aScanner.nextInt();
            if (userInput == correctNumber) {
                output = userInput;
                System.out.println("GOOD GUESS");
                break;
            } else if (userInput >= correctNumber) {
                System.out.println("LOWER");
            } else if (userInput <= correctNumber){
                System.out.println("Higher");
            } else {
                System.out.println("Invalid Input.");
            }
            System.out.println("Incorrect Try Again.");
            takenGuesses++;
            remainingGuesses--;
        };
        return output;
    };
};
