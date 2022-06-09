import javax.swing.*;
import java.text.DecimalFormat;

public class MileConversionsInteractive {
    static final double INCHES_IN_A_MILE = 63360;
    static final double FEET_IN_A_MILE = 5280;
    static final double YARDS_IN_A_MILE = 1760;

    public static void main (String [] args){
        explanation();
    }

    public static void explanation(){
        JOptionPane.showMessageDialog(null, "This program will convert Miles into Inches, " +
                "Feet and Yards");
        String milesInputted = JOptionPane.showInputDialog(null, "Enter a Mileage");
        double miles = Integer.parseInt(milesInputted);
        conversions(miles);

    }
    public static void conversions(double miles){
        DecimalFormat df = new DecimalFormat("###.###");
        double milesToInches = INCHES_IN_A_MILE / miles;
        double milesToFeet = FEET_IN_A_MILE / miles;
        double milesToYards = YARDS_IN_A_MILE / miles;
        JOptionPane.showMessageDialog(null,"12 Miles in Inches is " + df.format(milesToInches));
        JOptionPane.showMessageDialog(null,"12 Miles in Feet is " + df.format(milesToFeet));
        JOptionPane.showMessageDialog(null,"12 Miles in Yards is " + df.format(milesToYards));
    }
}

