import java.util.Scanner;
public class ActionAdventureGame {
    public static void main(String[] args) {
        //INITIAL SETUP OF NAME, SYSTEM, CHARACTER TYPE
        Scanner aScanner = new Scanner(System.in);
        System.out.print("\nHello Adventurer!\n\nWhat is your name?\t");
        String inputName = aScanner.nextLine();
        System.out.printf("\n\nNice to meet you %s!\n\n", inputName);
        System.out.println("\nThroughout your journey you will be asked to make decisions that ultimately determine your fate.\n");
        System.out.println("\nYou will make your choices by inputting the number that corresponds to your choice.\n");
        //TEACH USER CHOICE SELECTION
        understand();
        //END TEACH USER CHOICE SELECTION
        //CHARACTER ATTRIBUTES: Initialized for knight. Archer has -20 health and -5 left + 10 right. Mage has -30 health + 20 right; Potion restores 10 health;
        String characterName = inputName;
        String characterClass = "none";
        int characterHealth = 100;
        int characterAmmo = 0;
        int characterPotions = 5;
        int characterStamina = 10;
        int characterDamageLeftLim = 5;
        int characterDamageRightLim = 20;
        //END CHARACTER ATTRIBUTES
        //JOHN CENA ATTRIBUTES
        String johnCenaIntro = "JOHN CENA! *Trumpets play John Cena theme.";
        String johnCenaAttackPhrase = "You can't see me";
        String johnCenaDefeatPhrase = "Congratulations you are now the WWE World Champion.";
        int johnCenaHealth = 30;
        int johnCenaAmmo = 0;
        int johnCenaPotions = 1;
        int johnCenaStamina = 10;
        int johnCenaDamageLeftLim = 1;
        int johnCenaDamageRightLim = 10;
        //END JOHN CENA ATTRIBUTES
        //RICK JAMES ATTRIBUTES
        String rickJamesIntro = "I'm Rick James! Ah-ha-ha";
        String rickJamesAttackPhrase = "Why don't I stretch out.";
        String rickJamesDefeatPhrase = "Secuurity!";
        int rickJamesHealth = 40;
        int rickJamesAmmo = 0;
        int rickJamesPotions = 2;
        int rickJamesStamina = 10;
        int rickJamesDamageLeftLim = 0;
        int rickJamesDamageRightLim = 8;
        //END RICK JAMES ATTRIBUTES
        //OLD GREGG ATTRIBUTES
        String oldGreggIntro = "Hi there. I'm Old Gregg. Pleased to meetchu";
        String oldGreggAttackPhrase = "Here comes Old Gregg. He's a scaley man-fish";
        String oldGreggDefeatPhrase = "III'MM OLLLDDD GREEEEEEEEEGG!";
        int oldGreggHealth = 50;
        int oldGreggAmmo = 0;
        int oldGreggPotions = 52;
        int oldGreggStamina = 10;
        int oldGreggDamageLeftLim = 5;
        int oldGreggDamageRightLim = 15;
        //END OLD GREGG ATTRIBUTES
        //END INITIAL SETUP OF NAME, SYSTEM, CHARACTER TYPE, AND ENEMIES
        //RUN GAME


    };
    //TEACH USER CHOICE SELECTION
    public static void understand() {
        Scanner bScanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nDo you understand: 1. Yes : 2. No");
            int firstSel = bScanner.nextInt();
            if (firstSel == 1) {
                break;
            } else {
                System.out.println("\nInput 1 for Yes and 2 for No. Omit periods or any other characters. All choices are made by inputting a single integer.\n");
            };
        };
        bScanner.close();
    };
    //END TEACH USER CHOICE SELECTION
    public static void attack(String tgtName, String playerClass) {
        while (true) {
            if (tgtName.equalsIgnoreCase("john cena")) {
                johnCenaHealth -= attackDamage(playerClass);
                break;
            } else if (tgtName.equalsIgnoreCase("rick james")) {
                rickJamesHealth -= attackDamage(playerClass);
                break;
            } else if (tgtName.equalsIgnoreCase("old gregg")) {
                oldGreggHealth -= attackDamage(playerClass);
                break;
            } else {
                System.out.println("Improper target selection");
            };
        }

    };
    public static int attackDamage(String playerClass) {

        return output = (int)Math.round(Math.ceil(Math.random() * (characterDamageRightLim - characterDamageLeftLim) + 1));
    };


};
