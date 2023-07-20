import javax.swing.*;
import java.util.Scanner;

public class NumbersDemo2 {

    public static void main(String[]args){
        int numberOne = 0;
        int numberTwo = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        numberOne = input.nextInt();
        System.out.println("Enter Second Number");
        numberTwo = input.nextInt();

        System.out.println("First Number: " + numberOne);
        displayTwiceTheNumber(numberOne);
        displayNumberPlusFive(numberOne);
        displayNumberSquared(numberOne);

        System.out.println("Second Number: " + numberTwo);
        displayTwiceTheNumber(numberTwo);
        displayNumberPlusFive(numberTwo);
        displayNumberSquared(numberTwo);
    }
    private static void displayTwiceTheNumber(int x) {
        int newNumber = x * 2;
        System.out.println("Doubled: " + newNumber);

    }
    private static void displayNumberPlusFive(int x) {
        int newNumber = x + 5;
        System.out.println("Number Plus 5: " + newNumber);
    }

    private static void displayNumberSquared(int x) {
        int newNumber = x * x;
        System.out.println("Number Squared: " + newNumber);
    }
}

