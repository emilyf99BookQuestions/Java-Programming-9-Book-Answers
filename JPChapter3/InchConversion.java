import java.util.Scanner;

public class InchConversion {
    public static void main (String [] args){
        System.out.println("Enter Inches and I will convert to Feet and Yards:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in Inches");
        double inches = input.nextDouble();

        convertToFeet(inches);
        convertToYards(inches);
    }

    public static void convertToFeet(double inches){
        double conversion = inches / 12;
        System.out.println("There are 12 Inches in a Foot");
        System.out.println("Therefore " + inches + " inches is " + conversion + " feet");
    }

    public static void convertToYards(double inches){
        double conversion = inches / 36;
        System.out.println("There are 36 Inches in a Yard");
        System.out.println("Therefore " + inches + " inches is " + conversion + " yards");
    }
}
