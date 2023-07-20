import java.net.IDN;

public class ShowStudent2 {
    Student student;

    public ShowStudent2() {
        student = new Student();
        student.setIDNumber(9999);
        student.setNumberOfPointsEarned(12);
        student.setNumberOfCreditHours(3);
    }

    public static void main(String [] args){
        ShowStudent2 constructorTest = new ShowStudent2();
        Student student = constructorTest.student;
        Student.showStudent(student.getIDNumber(), student.getNumberOfPointsEarned(), student.getNumberOfCreditHours());
    }
}
