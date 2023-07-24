public class Event {
    final public static double PRICE_PER_GUEST = 35.00;
    final public static int LARGE_EVENT_CUTOFF = 50;
    private String eventNumber;
    private int numberOfGuests;
    private double price;

    public void setEventNumber(String eventNumber){
        this.eventNumber = eventNumber;
    }

    public void setGuests (int numberOfGuests){
        this.numberOfGuests = numberOfGuests;
        this.price = numberOfGuests * PRICE_PER_GUEST;
    }

    public String getEventNumber(){
        return eventNumber;
    }

    public int getNumberOfGuests(){
        return  numberOfGuests;
    }

    public double getPrice(){
        return price;
    }

    public boolean isLargeEvent() {
        return numberOfGuests >= LARGE_EVENT_CUTOFF;
    }
}
