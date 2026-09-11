package Estudiante;

public class student {

    private String studentID;
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public student(String studentID, String name, double grade1, double grade2, double grade3) {
        this.studentID = studentID;
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public double getAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public boolean setName(String newName) {

        if (!newName.isEmpty()) {
            name = newName;
            return true;
        } else {
            return false;
        }
    }

    public boolean setGrade1(double newGrade) {

        if (newGrade >= 0.0 && newGrade <= 5.0) {
            grade1 = newGrade;
            return true;
        } else {
            return false;
        }
    }

    public boolean setGrade2(double newGrade) {

        if (newGrade >= 0.0 && newGrade <= 5.0) {
            grade2 = newGrade;
            return true;
        } else {
            return false;
        }
    }

    public boolean setGrade3(double newGrade) {

        if (newGrade >= 0.0 && newGrade <= 5.0) {
            grade3 = newGrade;
            return true;
        } else {
            return false;
        }
    }
}