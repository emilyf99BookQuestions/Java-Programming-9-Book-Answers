import javax.swing.*;

public class BookstoreCredit {

    public static void main(String[] args){
        String studentName = "";
        Double gpa = 0.0;
        getValues(studentName, gpa);
    }

    public static void getValues(String name, Double gpa){
        JOptionPane.showMessageDialog(null, "Input your Name and GPA to find out your credit");
        name = JOptionPane.showInputDialog(null, "Name:");
        gpa = Double.valueOf(JOptionPane.showInputDialog(null, "GPA:"));

        double credit = gpa * 10;
        displayMessage(name, gpa, credit);
    }

    public static void displayMessage(String name, double gpa, double credit){
        JOptionPane.showMessageDialog(null, "Student " + name + ", Your GPA is " + gpa + "\n" +
                "This gives you a book store credit of £" + credit);
    }
}
