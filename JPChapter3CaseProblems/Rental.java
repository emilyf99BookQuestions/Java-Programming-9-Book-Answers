public class Rental {
    public final static int NUMBER_OF_MINUTES_IN_HOUR = 60;
    public final static double HOURLY_RENTAL_RATE = 40.0;

    private String contractNumber;
    private int numberOfHours;
    private int minutesOverAnHour;
    private double price;

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setHoursAndMinutes(int minutes){
        this.numberOfHours = minutes / NUMBER_OF_MINUTES_IN_HOUR;
        this.minutesOverAnHour = minutes % NUMBER_OF_MINUTES_IN_HOUR;
        this.price = (numberOfHours * HOURLY_RENTAL_RATE) + minutesOverAnHour;
    }

    public String getContractNumber(){
        return contractNumber;
    }

    public int getNumberOfHours(){
        return numberOfHours;
    }

    public int getMinutesOverAnHour(){
        return minutesOverAnHour;
    }

    public double getPrice(){
        return price;
    }

}

