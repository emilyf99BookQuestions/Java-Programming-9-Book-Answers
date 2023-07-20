import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args){
        double doubleOne = 0.0;
        double doubleTwo = 0.0;

        System.out.println("Enter Two Decimal Numbers:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Decimal");
        doubleOne = input.nextDouble();
        System.out.println("Enter Second Number");
        doubleTwo = input.nextDouble();

        computePercent(doubleOne, doubleTwo);
        computePercent(doubleTwo, doubleOne);
    }

    public static void computePercent(double x, double y){
        double percent = (x / y) * 100 ;

        System.out.println(x + " is " + percent + " of " + y);
    }
}
