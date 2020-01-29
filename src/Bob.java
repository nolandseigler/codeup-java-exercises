import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Talk to Bob.\n");
        while(true) {
            String tellBob = aScanner.nextLine();
            if (tellBob.endsWith("?")) {
                System.out.println("Sure");
            } else if (tellBob.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (tellBob.equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (tellBob.equals("Go to your room.")) {
                System.out.println("K. Fine.");
                break;
            } else {
                System.out.println("Whatever.");
            };
        };
    };
};
