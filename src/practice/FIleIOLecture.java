package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FIleIOLecture {
    static void newFile(String dir, String fileName) {
        String directory = dir;
        String filename = fileName;
        Path practiceDir = Paths.get(directory);
        System.out.println(practiceDir.toAbsolutePath());
        Path practiceFile = Paths.get(directory, filename);
        try {
            if(Files.notExists(practiceDir)) {
                Files.createDirectories(practiceDir);
                System.out.println("Created directory.");
            }
            if(!Files.exists(practiceFile)) {
                Files.createFile(practiceFile);
                System.out.println("Created file.");

            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    static void readAndWriteFile() {
        List<String> dogs = null;
        try {
           Path dogsFile = Paths.get("practice-dir", "dogs.txt");
           dogs = Files.readAllLines(dogsFile);
           for(String dog : dogs) {
               System.out.println(dog);
           }
        } catch(IOException ioe) {
           ioe.printStackTrace();
        }
        dogs.add("Jack");
        dogs.add("Sally");
        dogs.add("Scooter");
        try {
            Path dogsFile = Paths.get("practice-dir", "dogs.txt");
            Files.write(dogsFile, dogs);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public static void main(String[] args) {
        newFile("practice-dir", "dogs.txt");
        readAndWriteFile();
    }
}
