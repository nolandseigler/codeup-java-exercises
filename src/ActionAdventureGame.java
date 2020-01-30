import java.util.Scanner;
public class ActionAdventureGame {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("\nHello Adventurer!\n\nWhat is your name?\t");
        String characterName = aScanner.nextLine();
        System.out.printf("\n\nNice to meet you %s!\n\n", characterName);
        System.out.println("\nThroughout your journey you will be asked to make decisions that ultimately determine your fate.\n");
        System.out.println("\nYou will make your choices by inputting the number that corresponds to your choice.\n");
        while (true) {
            System.out.println("\nDo you understand: 1. Yes : 2. No");
            int firstSel = aScanner.nextInt();
            if (firstSel == 1) {
                break;
            } else {
                System.out.println("\nInput 1 for Yes and 2 for No. Omit periods or any other characters. All choices are made by inputting a single integer.\n");
            }
        };


    };

};
