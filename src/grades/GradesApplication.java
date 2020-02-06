package grades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class GradesApplication {
    private static Scanner aScanner = new Scanner(System.in);
    private static BufferedWriter br;

    static {
        try {
            br = new BufferedWriter(new FileWriter("student-report.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        HashMap<String, Student> students = new HashMap<>();
        Student bob = new Student("Bob");
        bob.addGrade(70);
        bob.addGrade(83);
        bob.addGrade(57);
        Student lisa = new Student("Lisa");
        lisa.addGrade(98);
        lisa.addGrade(93);
        lisa.addGrade(95);
        Student louis = new Student("Louis");
        louis.addGrade(78);
        louis.addGrade(99);
        louis.addGrade(89);
        Student jenny = new Student("Jenny");
        jenny.addGrade(73);
        jenny.addGrade(28);
        jenny.addGrade(93);
        students.put("BobDoesDev", bob);
        students.put("Lisa_Smith", lisa);
        students.put("LouisLovesCoding(LLC)", louis);
        students.put("Jenny", jenny);
        while(true) {
            String userInput = "";
            System.out.println("Student Github usernames and options: ");
            System.out.println(stringKeysForPrint(students) + "Option: Show Class Average" + "Option: Print CSV");
            userInput = makeSelection("Input a Github username to see more information or input an option: ");
            if (students.containsKey(userInput)) {
                System.out.println(displayUserData(userInput, students));
            } else if (userInput.toLowerCase().equals("show class average")) {
                System.out.printf("Class Average: %.1f\n", getClassAverage(students));
            } else {
                System.out.println("Sorry, no student with the username " + "'" + userInput + "'" + " has been found.");
            }
            userInput = makeSelection("Continue Search?  Yes | No : ");
            if(userInput.toLowerCase().equals("no")) {
                System.out.println("Goodbye, and have a wonderful day.");
                break;
            }
        }
        writeStudentReportCSV(students);
    }
    public static String makeSelection(String prompt) {
        System.out.printf("%s\t",prompt);
        return aScanner.nextLine();
    }
    public static String stringKeysForPrint(HashMap<String, Student> inputMap) {
        String output = "";
        Set<String> keysSet = inputMap.keySet();
        String[] keysArr = keysSet.toArray(new String[keysSet.size()]);
        for (String key : keysArr) {
            output += "| " + key + " |  ";
        }
        return output;
    }
    public static String displayUserData(String githubUsername, HashMap<String, Student> inputMap) {
        String output = "";
        if (inputMap.get(githubUsername) != null) {
            Student student = (Student) inputMap.get(githubUsername);
            String studentName = student.getName();
            double studentAverage = student.getGradeAverage();
            output = String.format("Name: %s  |  Github Username: %s\nCurrent Average: %.1f\nStudent Grades: %s\nStudent Attendance Percentage: %.1f", studentName, githubUsername, studentAverage, student.getGradesString(), student.attendancePercentage());
        } else {
            output = "Invalid Github Username.";
        }
        return output;
    }
    public static double getClassAverage(HashMap<String, Student> inputMap) {
        double output = 0;
        long i = 0;
        for (HashMap.Entry<String, Student> entry : inputMap.entrySet()) {
            ArrayList<Integer> studentGrades = entry.getValue().getGrades();
            for (int grade : studentGrades) {
               output+=grade;
               i++;
            }
        }
        return output/i;
    }
    public static void writeStudentReportCSV(HashMap<String, Student> inputMap) throws IOException {
        String[] array = new String[inputMap.size()];
        int i = 0;
        for (HashMap.Entry<String, Student> entry : inputMap.entrySet()) {
            String appendThis = displayUserData(entry.getKey(), inputMap);
            if (!appendThis.equals("Invalid Github Username.")) {
                array[i] = appendThis;
            } else {
                array[i] = " " + entry.getKey() + "Not Found";
            }
            i++;
        }
        for (String element : array) {
            sb.append(element);
            sb.append(",");
        }

        br.write(sb.toString());
        br.close();
    }
}
