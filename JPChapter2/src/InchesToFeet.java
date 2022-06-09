/*Write a program that declares a variable named inches, which holds a length
in inches, and assign a value. Display the value in feet and inches; for example,
86 inches becomes 7 feet and 2 inches*/

public class InchesToFeet {
    static final int INCHES_IN_FOOT = 12;
    static int inches = 18;

    public static void main (String [] args){
        explanation();
        calculation();
    }

    public static void explanation(){
        System.out.println("The Program Will Convert 18 Inches into Feet");
    }

    public static void calculation(){
        int feetTotal = inches / INCHES_IN_FOOT;
        int inchesRemainder = inches % INCHES_IN_FOOT;

        System.out.println(inches + " inches converted to feet is " + feetTotal + " feet and " + inchesRemainder +
                " inches");

    }
}
