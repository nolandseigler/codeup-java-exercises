package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }
    String getName() {
        return this.name;
    }
    void addGrade(int grade) {
        this.grades.add(grade);
    }
    double getGradeAverage() {
        double sum = 0;
        for(Integer grade : this.grades) {
            sum+=grade;
        }
        return sum / grades.size();
    }
    String getGradesString() {
        String output = "";
        int i = 1;
        for(Integer grade : this.grades) {
            output+= i + ".  " + grade + "  |";
            i++;
        }
        return output;
    }
    ArrayList<Integer> getGrades() {
        return this.grades;
    }
    void recordAttendance(String date, String value) {
        value = value.toUpperCase();
        if (value.equals("P") || value.equals("A") && date.matches("([0-9]{4}-[0-9]{2}-[0-9]{2})")) {
            this.attendance.put(date, value);
        } else {
            System.out.println("Error in recordAttendance");
        }
    }
    double attendancePercentage() {
        double output = 0;
        for (HashMap.Entry<String, String> entry : this.attendance.entrySet()) {
            if (entry.getValue().equals("P")) {
                output++;
            }
        }
        return output/this.attendance.size();
    }
    ArrayList<String> daysAbsent() {
        ArrayList<String> output = new ArrayList<>();
        for (HashMap.Entry<String, String> entry : this.attendance.entrySet()) {
            if (entry.getValue().equals("A")) {
                output.add(entry.getKey());
            }
        }
        return output;
    }
}
