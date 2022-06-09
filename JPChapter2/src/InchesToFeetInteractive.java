
/*InchesToFeetInteractive */

import javax.swing.*;

public class InchesToFeetInteractive {
    static final int INCHES_IN_FOOT = 12;

    public static void main (String [] args){
        explanation();
    }

    public static void explanation(){
        JOptionPane.showMessageDialog(null,"The Program Will Convert Inches into Feet");
        String inchesInput = JOptionPane.showInputDialog(null, "Enter value in Inches");
        int inches = Integer.parseInt(inchesInput);
        calculation(inches);
    }

    public static void calculation(int inches){
        int feetTotal = inches / INCHES_IN_FOOT;
        int inchesRemainder = inches % INCHES_IN_FOOT;
        JOptionPane.showMessageDialog(null,inches + " inches converted to feet is " + feetTotal
                + " feet and " + inchesRemainder + " inches");

    }
}
