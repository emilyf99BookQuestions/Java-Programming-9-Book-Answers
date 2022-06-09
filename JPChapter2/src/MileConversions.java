/*Write a program that declares named constants to represent the number of
inches, feet, and yards in a mile. Also declare a variable to represent a number
of miles and assign a value to it. Compute and display, with explanatory text, the
value in inches, feet, and yards. */

public class MileConversions {
    static final double INCHES_IN_A_MILE = 63360;
    static final double FEET_IN_A_MILE = 5280;
    static final double YARDS_IN_A_MILE = 1760;

    public static void main (String [] args){
        explanation();
        conversions();
    }

    public static void explanation(){
        System.out.println("This program will convert 12 miles into Inches, Feet and Yards");
    }
    public static void conversions(){
        int miles = 4000;
        double milesToInches = INCHES_IN_A_MILE / miles ;
        double milesToFeet = FEET_IN_A_MILE / miles;
        double milesToYards = YARDS_IN_A_MILE / miles;
        System.out.println("12 Miles in Inches is " + milesToInches);
        System.out.println("12 Miles in Feet is " + milesToFeet);
        System.out.println("12 Miles in Yards is " + milesToYards);
    }
}
