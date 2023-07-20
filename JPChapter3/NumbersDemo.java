public class NumbersDemo {

    public static void main(String[]args){
        int numberOne = 1;
        int numberTwo = 2;

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
