import java.util.Scanner;
public class ActionAdventureGame {
    private static Scanner aScanner = new Scanner(System.in);
    private static String characterName = "";
    //CHARACTER ATTRIBUTES: Initialized for knight. Archer has -20 health and -5 left + 10 right. Mage has -30 health + 20 right; Potion restores 10 health;
    private static String characterClass = "none";
    private static int characterHealth = 100;
    private static int characterAmmo = 10;
    private static int characterPotions = 5;
    private static int characterStamina = 10;
    private static int characterDamageLeftLim = 5;
    private static int characterDamageRightLim = 20;
    //END CHARACTER ATTRIBUTES
    //JOHN CENA ATTRIBUTES
    private static String johnCenaIntro = "JOHN CENA! *Trumpets play John Cena theme.";
    private static String johnCenaAttackPhrase = "JOHN CENA: You can't see me!";
    private static String johnCenaDefeatPhrase = "JOHN CENA: Congratulations you are now the WWE World Champion.";
    private static int johnCenaHealth = 40;
    private static int johnCenaAmmo = 0;
    private static int johnCenaPotions = 1;
    private static int johnCenaStamina = 10;
    private static int johnCenaDamageLeftLim = 1;
    private static int johnCenaDamageRightLim = 10;
    //END JOHN CENA ATTRIBUTES
    //RICK JAMES ATTRIBUTES
    private static String rickJamesIntro = "RICK JAMES: I'm Rick James! Ah-ha-ha";
    private static String rickJamesAttackPhrase = "RICK JAMES: Why don't I stretch out.";
    private static String rickJamesDefeatPhrase = "RICK JAMES: Secuurity!";
    private static int rickJamesHealth = 50;
    private static int rickJamesAmmo = 0;
    private static int rickJamesPotions = 2;
    private static int rickJamesStamina = 10;
    private static int rickJamesDamageLeftLim = 0;
    private static int rickJamesDamageRightLim = 8;
    //END RICK JAMES ATTRIBUTES
    //OLD GREGG ATTRIBUTES
    private static String oldGreggIntro = "OLD GREGG: Hi there. I'm Old Gregg. Pleased to meetchu";
    private static String oldGreggAttackPhrase = "OLD GREGG: Here comes Old Gregg. He's a scaley man-fish";
    private static String oldGreggDefeatPhrase = "OLD GREGG: III'MM OLLLDDD GREEEEEEEEEGG!";
    private static int oldGreggHealth = 70;
    private static int oldGreggAmmo = 0;
    private static int oldGreggPotions = 52;
    private static int oldGreggStamina = 10;
    private static int oldGreggDamageLeftLim = 5;
    private static int oldGreggDamageRightLim = 15;
    //END OLD GREGG ATTRIBUTES
    //END INITIAL SETUP OF NAME, SYSTEM, CHARACTER TYPE, AND ENEMIES
    public static void main(String[] args) {
        //INITIAL SETUP OF NAME, SYSTEM, CHARACTER TYPE
        System.out.print("\nHello Adventurer!\n\nWhat is your name?\t");
        characterName = aScanner.nextLine();
        System.out.printf("\n\nNice to meet you %s!\n\n", characterName);
        System.out.println("\nThroughout your journey you will be asked to make decisions that ultimately determine your fate.\n");
        System.out.println("\nYou will make your choices by inputting the number that corresponds to your choice.\n");
        //TEACH USER CHOICE SELECTION
        understand();
        //END TEACH USER CHOICE SELECTION

        //RUN GAME
        fightJohnCena();
        fightRickJames();
        fightOldGregg();
    };
    //TEACH USER CHOICE SELECTION
    public static void understand() {
        while (true) {
            System.out.println("\nDo you understand: 1. Yes : 2. No");
            int firstSel = aScanner.nextInt();
            if (firstSel == 1) {
                break;
            } else {
                System.out.println("\nInput 1 for Yes and 2 for No. Omit periods or any other characters. All choices are made by inputting a single integer.\n");
            };
        };
    };
    //END TEACH USER CHOICE SELECTION
    public static int attack(String tgtName) {
        int damageDealt = attackDamage();
        while (true) {
            if (tgtName.equalsIgnoreCase("john cena")) {
                johnCenaHealth -= damageDealt;
                break;
            } else if (tgtName.equalsIgnoreCase("rick james")) {
                rickJamesHealth -= damageDealt;
                break;
            } else if (tgtName.equalsIgnoreCase("old gregg")) {
                oldGreggHealth -= damageDealt;
                break;
            } else {
                System.out.println("Improper target selection");
            };
        }
        return damageDealt;
    };
    public static int attackDamage() {

        return (int)Math.round(Math.floor(Math.random() * (characterDamageRightLim - characterDamageLeftLim + 1) + characterDamageLeftLim));
    };
    public static void fightJohnCena() {
        System.out.printf("\n%s\n\n",johnCenaIntro);
        while (true) {
            System.out.printf("John Cena has %d health remaining.\n%s has %d health, %d stamina/ammo, and %d potions remaining.\n\n", johnCenaHealth, characterName, characterHealth, characterStamina, characterPotions);
            System.out.print("Make a choice: 1. Attack John Cena : 2. Drink Potion : 3. Recover Stamina/Ammo (Wait turn but recover 1 Stamina Point)\n");
            int choice = aScanner.nextInt();

            if (choice == 1 && characterStamina > 0 && characterAmmo > 0) {
                int damageDealt = attack("john cena");
                System.out.printf("%s hit John Cena for %d points of damage.\n", characterName, damageDealt);
                enemyAttack("john cena");
                int enemyDamageDealt = enemyAttack("john cena");
                System.out.printf("%s\n", johnCenaAttackPhrase);
                System.out.printf("John Cena hit %s for %d points of damage.\n", characterName, enemyDamageDealt);
                characterStamina--;
                characterAmmo--;
            } else if (choice == 2 && characterPotions > 0) {
                characterHealth += 10;
                System.out.printf("%s drank a potion and recovered 10 health points.\n", characterName);
                enemyAttack("john cena");
                characterPotions--;
            } else if (choice == 3) {
                characterStamina ++;
                System.out.printf("%s rested and recovered 1 stamina/ammo point.\n", characterName);
                enemyAttack("john cena");
                characterPotions--;
            } else {
                System.out.println("Make a proper selection");
            }
            if (johnCenaHealth <= 0) {
                System.out.printf("\n%s\n\n", johnCenaDefeatPhrase);
                break;
            };
            if (characterHealth <= 0) {
                System.out.printf("\n%s\n\n", "You lost the fight.");
                break;
            };
        }
    };
    public static void fightRickJames() {
        System.out.printf("\n%s\n\n",rickJamesIntro);
        while (true) {
            System.out.printf("Rick James has %d health remaining.\n%s has %d health, %d stamina/ammo, and %d potions remaining.\n\n", rickJamesHealth, characterName, characterHealth, characterStamina, characterPotions);
            System.out.print("Make a choice: 1. Attack Rick James : 2. Drink Potion : 3. Recover Stamina/Ammo (Wait turn but recover 1 Stamina Point)\n");
            int choice = aScanner.nextInt();

            if (choice == 1 && characterStamina > 0 && characterAmmo > 0) {
                int damageDealt = attack("Rick James");
                System.out.printf("%s hit Rick James for %d points of damage.\n", characterName, damageDealt);
                enemyAttack("Rick James");
                int enemyDamageDealt = enemyAttack("Rick James");
                System.out.printf("%s\n", rickJamesAttackPhrase);
                System.out.printf("Rick James hit %s for %d points of damage.\n", characterName, enemyDamageDealt);
                characterStamina--;
                characterAmmo--;
            } else if (choice == 2 && characterPotions > 0) {
                characterHealth += 10;
                System.out.printf("%s drank a potion and recovered 10 health points.\n", characterName);
                enemyAttack("Rick James");
                characterPotions--;
            } else if (choice == 3) {
                characterStamina ++;
                System.out.printf("%s rested and recovered 1 stamina/ammo point.\n", characterName);
                enemyAttack("Rick James");
                characterPotions--;
            } else {
                System.out.println("Make a proper selection");
            }
            if (rickJamesHealth <= 0) {
                System.out.printf("\n%s\n\n", rickJamesDefeatPhrase);
                break;
            };
            if (characterHealth <= 0) {
                System.out.printf("\n%s\n\n", "You lost the fight.");
                break;
            };
        }
    };
    public static void fightOldGregg() {
        System.out.printf("\n%s\n\n",oldGreggIntro);
        while (true) {
            System.out.printf("Old Gregg has %d health remaining.\n%s has %d health, %d stamina/ammo, and %d potions remaining.\n\n", oldGreggHealth, characterName, characterHealth, characterStamina, characterPotions);
            System.out.print("Make a choice: 1. Attack Old Gregg : 2. Drink Potion : 3. Recover Stamina/Ammo (Wait turn but recover 1 Stamina Point)\n");
            int choice = aScanner.nextInt();

            if (choice == 1 && characterStamina > 0 && characterAmmo > 0) {
                int damageDealt = attack("Old Gregg");
                System.out.printf("%s hit Old Gregg for %d points of damage.\n", characterName, damageDealt);
                enemyAttack("Old Gregg");
                int enemyDamageDealt = enemyAttack("Old Gregg");
                System.out.printf("%s\n", oldGreggAttackPhrase);
                System.out.printf("Old Gregg hit %s for %d points of damage.\n", characterName, enemyDamageDealt);
                characterStamina--;
                characterAmmo--;
            } else if (choice == 2 && characterPotions > 0) {
                characterHealth += 10;
                System.out.printf("%s drank a potion and recovered 10 health points.\n", characterName);
                enemyAttack("Old Gregg");
                characterPotions--;
            } else if (choice == 3) {
                characterStamina ++;
                System.out.printf("%s rested and recovered 1 stamina/ammo point.\n", characterName);
                enemyAttack("Old Gregg");
                characterPotions--;
            } else {
                System.out.println("Make a proper selection");
            }
            if (oldGreggHealth <= 0) {
                System.out.printf("\n%s\n\n", oldGreggDefeatPhrase);
                break;
            };
            if (characterHealth <= 0) {
                System.out.printf("\n%s\n\n", "You lost the fight.");
                break;
            };
        }
    };
    public static int enemyAttack(String enemyName) {
        int enemyDamageLeftLim = 0;
        int enemyDamageRightLim = 0;
        if (enemyName.equalsIgnoreCase("john cena")) {
            enemyDamageRightLim = johnCenaDamageRightLim;
            enemyDamageLeftLim = johnCenaDamageLeftLim;
        } else if (enemyName.equalsIgnoreCase("rick james")) {
            enemyDamageRightLim = rickJamesDamageRightLim;
            enemyDamageLeftLim = rickJamesDamageLeftLim;
        } else if (enemyName.equalsIgnoreCase("old gregg")) {
            enemyDamageRightLim = oldGreggDamageRightLim;
            enemyDamageLeftLim = oldGreggDamageLeftLim;
        } else {
            System.out.println("Improper target selection");
        };
        int damageToPlayer = (int) Math.round(Math.floor(Math.random() * (enemyDamageRightLim - enemyDamageLeftLim + 1) + enemyDamageLeftLim));
        characterHealth -= damageToPlayer;
        return damageToPlayer;
    };
    public static int randomNumber() {
        return (int) Math.round(Math.floor(Math.random() * (40) + 1));
    };
};


