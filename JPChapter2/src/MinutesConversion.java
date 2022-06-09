
/*Write a program that accepts a number of minutes and converts it both to hours
and days. For example, 6,000 minutes equals 100 hours and equals 4.167 days. */

import javax.swing.*;
import java.text.DecimalFormat;

public class MinutesConversion {

    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String [] args){
        input();
    }

    public static void input(){
        JOptionPane.showMessageDialog(null, "Enter a number of minutes and convert it to hours "
                + "and" + " days");
        String inputString = JOptionPane.showInputDialog(null, "Minutes:");
        int input = Integer.parseInt(inputString);

        hours(input);
    }

    public static void hours(int minutes){
        double hours = minutes / 60;
        JOptionPane.showMessageDialog(null, minutes + " in hours is " + df.format(hours)
                + " hours.");
        days(hours);
    }

    public static void days(double hours){
        double days = hours / 24;
        JOptionPane.showMessageDialog(null, hours + " hours in days is " + df.format(days)
                + " days.");
    }
}
