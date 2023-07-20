import javax.swing.*;

public class Student {
    Integer IDNumber;
    Integer numberOfCreditHours;
    Integer numberOfPointsEarned;

    public Integer getIDNumber(){
        return IDNumber;
    }

    public Integer getNumberOfCreditHours(){
        return numberOfCreditHours;
    }

    public Integer getNumberOfPointsEarned() {
        return numberOfPointsEarned;
    }

    public void setIDNumber(Integer IDNumber){
        this.IDNumber = IDNumber;
    }

    public void setNumberOfCreditHours(Integer numberOfCreditHours){
        this.numberOfCreditHours = numberOfCreditHours;
    }

    public void setNumberOfPointsEarned(Integer numberOfPointsEarned) {
        this.numberOfPointsEarned = numberOfPointsEarned;
    }

    public static double calculateGPA(Integer points, Integer creditHours){
        double gpa = points / creditHours;
        return gpa;
    }

    public static void showStudent(Integer IDNumber, Integer numberOfPointsEarned, Integer numberOfCreditHours){
        double gpa = calculateGPA(numberOfPointsEarned, numberOfCreditHours);
        JOptionPane.showMessageDialog(null, "Student: " + IDNumber + "\nNumber of Points Earned: "
        + numberOfPointsEarned + "\nNumber of Credit Hours: " + numberOfCreditHours + "\nGPA: " + gpa);

    }

}
