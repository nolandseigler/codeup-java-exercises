package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }
    public String getName() {
        return this.name;
    }
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    public double getGradeAverage() {
        double sum = 0;
        for(Integer grade : this.grades) {
            sum+=grade;
        }
        return sum / grades.size();
    }
    public String getGradesString() {
        String output = "";
        int i = 1;
        for(Integer grade : this.grades) {
            output+= i + ".  " + grade + "  |";
            i++;
        }
        return output;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
