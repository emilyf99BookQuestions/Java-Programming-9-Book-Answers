public class Percentages {

    public static void main(String[] args){
        double doubleOne = 2.4;
        double doubleTwo = 5.6;

        computePercent(doubleOne, doubleTwo);
        computePercent(doubleTwo, doubleOne);
    }

    public static void computePercent(double x, double y){
        double percent = (x / y) * 100 ;

        System.out.println(x + " is " + percent + " of " + y);
    }
}
