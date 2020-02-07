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
        String date1 = "2020-01-12";
        String date2 = "2020-01-13";
        String date3 = "2020-01-14";
        String date4 = "2020-01-15";
        String date5 = "2020-01-16";
        bob.recordAttendance(date1, "A");
        bob.recordAttendance(date2, "A");
        bob.recordAttendance(date3, "A");
        bob.recordAttendance(date4, "P");
        lisa.recordAttendance(date1, "P");
        lisa.recordAttendance(date2, "P");
        lisa.recordAttendance(date3, "A");
        lisa.recordAttendance(date4, "P");
        louis.recordAttendance(date1, "P");
        louis.recordAttendance(date2, "P");
        louis.recordAttendance(date3, "A");
        louis.recordAttendance(date4, "P");
        jenny.recordAttendance(date1, "P");
        jenny.recordAttendance(date2, "P");
        jenny.recordAttendance(date3, "A");
        jenny.recordAttendance(date4, "A");
        while(true) {
            String userInput = "";
            System.out.println("Student Github usernames and options: ");
            System.out.println(stringKeysForPrint(students) + "Option: Show Class Average" + " | " + "Option: Print CSV");
            userInput = makeSelection("Input a Github username to see more information or input an option: ");
            if (students.containsKey(userInput)) {
                System.out.println(displayUserData(userInput, students));
            } else if (userInput.toLowerCase().equals("show class average")) {
                System.out.printf("Class Average: %.1f\n", getClassAverage(students));
            }  else if (userInput.toLowerCase().equals("print csv")) {
                writeStudentReportCSV(students);
                System.out.println("CSV report generated.");
            } else {
                System.out.println("Sorry, no student with the username " + "'" + userInput + "'" + " has been found.");
            }
            userInput = makeSelection("Continue Search?  Yes | No : ");
            if(userInput.toLowerCase().equals("no")) {
                System.out.println("Goodbye, and have a wonderful day.");
                break;
            }
        }
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
            output = String.format("Name: %s  |  Github Username: %s\nCurrent Average: %.1f\nStudent Grades: %s\nStudent Attendance Percentage: %.1f\nStudent Days Absent: %s", studentName, githubUsername, studentAverage, student.getGradesString(), student.attendancePercentage(), student.daysAbsent());
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
