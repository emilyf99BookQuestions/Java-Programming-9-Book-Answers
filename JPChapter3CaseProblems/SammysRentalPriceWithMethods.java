import javax.swing.*;

public class SammysRentalPriceWithMethods {

    public static void main (String[]args){
        int minutesFromUser = getTime();
        printMotto();
        calculateTotals(minutesFromUser);
    }
    public static void printMotto(){
        JOptionPane.showMessageDialog(null, "" +
                "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n" +
                "S                                 S\n" +
                "S Sammy's makes it fun in the sun S\n" +
                "S                                 S\n" +
                "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }

    public static int getTime(){
        int time = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Minutes Rented: "));
        return time;
    }

    public static int calculateHours(int minutesTotal){
            return minutesTotal / 60;
    }
    public static int calculateRemainderMinutes(int minutesTotal){
            return minutesTotal % 60;
    }
    public static int calculateTotalCost(int hours, int minutes){
        int hourTotal = hours * 40;
        int minutesTotal = minutes;
        int total = hourTotal + minutesTotal;
        return total;
    }

    public static void printRentalDetails(int hours, int minutes, int total){
        JOptionPane.showMessageDialog(null,"Hours Rented: " + hours + "\nMinutes Rented: "
                + minutes +  "\nTotal Price: £" + total );
    }

    public static void calculateTotals(int minutes){
        int hours = calculateHours(minutes);
        int minutesRemainder = calculateRemainderMinutes(minutes);
        int totalCost = calculateTotalCost(hours, minutesRemainder);

        printRentalDetails(hours, minutesRemainder, totalCost);
    }

}
