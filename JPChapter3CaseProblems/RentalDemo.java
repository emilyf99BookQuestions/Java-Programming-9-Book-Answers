import javax.swing.*;

public class RentalDemo {

    public static void main(String[] args){
        Rental rental = new Rental();

        String contractNumber = getContract();
        int minutesFromUser = getTime();

        rental.setContractNumber(contractNumber);
        rental.setHoursAndMinutes(minutesFromUser);

        SammysRentalPriceWithMethods.printMotto();

        printRentalDetails(rental);
    }

    public static void printMotto(){
        JOptionPane.showMessageDialog(null, "" +
                "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n" +
                "S                                 S\n" +
                "S Sammy's makes it fun in the sun S\n" +
                "S                                 S\n" +
                "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }
    public static String getContract(){
        String contractNumber = JOptionPane.showInputDialog(null, "Enter Your Contract Number: ");
        return contractNumber;
    }

    public static int getTime(){
        int time = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Minutes Rented: "));
        return time;
    }

    public static void printRentalDetails(Rental rental){
        JOptionPane.showMessageDialog(null, "Contract number: " + rental.getContractNumber() +
                "\nHours Rented: " + rental.getNumberOfHours() + "\nMinutes Rented: " + rental.getMinutesOverAnHour() +
                "\nTotal Price: £" + rental.getPrice());
    }


}


/*Use the SammysRentalPriceWithMethods class you created in Step 2a as a
starting point for a program that demonstrates the Rental class you created
in Step 2b, but make the following changes:



• Revise the method that displays the rental details so that it accepts the
newly created Rental object. The method should display the contract
number, and it still should display the hours and minutes, the hourly rate,
and the total price.  */