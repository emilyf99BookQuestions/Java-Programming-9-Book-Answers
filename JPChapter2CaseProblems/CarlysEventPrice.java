import javax.swing.*;

public class CarlysEventPrice {

    public static void main (String[]args){
        int guests = getGuests();
        printMotto();
        int total = calculatePrice(guests);
        boolean largeParty = largePartyCheck(guests);

        printPartyDetails(guests, total, largeParty);
    }

    public static void printMotto(){
        JOptionPane.showMessageDialog(null,
                "************************************************\n" +
                        "*                                              *\n" +
                        "* Carly's makes the food that makes it a party *\n" +
                        "*                                              *\n" +
                        "************************************************");
    }

    public static int getGuests(){
        int guests = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your Number of Guests: "));
        return guests;
    }

    public static int calculatePrice(int guests){
        int total = guests * 35;
        return total;
    }

    public static boolean largePartyCheck(int guests){
        return guests >= 50;
    }

    public static void printPartyDetails(int guests, int total, boolean largeParty){
        JOptionPane.showMessageDialog(null, "Number of Guests: " + guests +
                "\nPrice Per Guest: £35 \nTotal Price: £" + total + "\nLarge Event Status: " + largeParty);
    }

}
