import javax.swing.*;

public class SammysRentalPrice {
    public static void main (String[]args){
        int minutesFromUser = getTime();
        int hours = calculateHours(minutesFromUser);
        int minutesRemainder = calculateRemainderMinutes(minutesFromUser);
        int totalCost = calculateTotalCost(hours, minutesRemainder);
        printMotto();
        printRentalDetails(hours, minutesRemainder, totalCost);
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
}
