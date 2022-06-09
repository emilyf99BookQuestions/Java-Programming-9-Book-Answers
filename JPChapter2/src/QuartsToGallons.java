
/*Write a program that declares a named constant to hold the number of quarts in a gallon.
Declare a variable to represent the number of quarts needed for a painting job.
Compute and display the number of gallons and quarts needed for the job.
Display explanatory text with the values—for example, A job that needs 18 quarts requires 4 gallons
plus 2 quarts. Save the program as QuartsToGallons.java. */

public class QuartsToGallons {
    static final int QUARTS = 4;
    static int paintJob = 18;

    public static void main (String [] args){
        explanation();
        calculation();
    }

    public static void explanation(){
        System.out.println("The Program Will Convert 18 Quarts into Gallons");
    }

    public static void calculation(){
        int gallonsTotal = paintJob / QUARTS;
        int quartsRemainder = paintJob % QUARTS;

        System.out.println(paintJob + " Quarts in Gallons is " + gallonsTotal + " gallons and " + quartsRemainder + " quarts");

    }
}
