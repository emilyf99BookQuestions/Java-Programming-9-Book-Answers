import javax.swing.*;

public class EventDemo {

    public static void main (String[]args){
        Event event = new Event();
        String eventNumber = getEventNumber();
        int guests = getGuests();

        event.setEventNumber(eventNumber);
        event.setGuests(guests);

        CarlysEventPriceWithMethods.printMotto();
        printPartyDetails(event);
    }

    public static String getEventNumber(){
        String eventNumber = JOptionPane.showInputDialog(null, "Enter Your Number of Guests: ");
        return eventNumber;
    }
    public static int getGuests(){
        int guests = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your Number of Guests: "));
        return guests;
    }

    public static void printPartyDetails(Event event){
        JOptionPane.showMessageDialog(null, "Event Number: " + event.getEventNumber() +
                "\nNumber of Guests: " + event.getNumberOfGuests() + "\nPrice Per GuestL: £" + Event.PRICE_PER_GUEST +
                "\nTotal Price: £" + event.getPrice() + "\nLarge Event Status: " + event.isLargeEvent());
    }
}
