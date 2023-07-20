import javax.swing.*;

public class Lease {
    String tenantsName;
    int apartmentNumber;
    double monthlyRental;
    int leaseLengthsMonths;

    public Lease(){
        tenantsName = "XXX";
        apartmentNumber = 0;
        monthlyRental = 1000;
        leaseLengthsMonths = 12;
    }

    public String getTenantsName(){
        return tenantsName;
    }
    public int getApartmentNumber(){
        return apartmentNumber;
    }
    public double getMonthlyRental() {
        return monthlyRental;
    }
    public int getLeaseLengthsMonths(){
        return leaseLengthsMonths;
    }
    public void setTenantsName(String tenantsName){
        this.tenantsName = tenantsName;
    }
    public void setApartmentNumber(int apartmentNumber){
        this.apartmentNumber = apartmentNumber;
    }
    public void setMonthlyRental(double monthlyRental){
        this.monthlyRental = monthlyRental;
    }
    public void setLeaseLengthsMonths(int leaseLengthsMonths){
        this.leaseLengthsMonths = leaseLengthsMonths;
    }

    public void addPetFee(Lease lease){
        monthlyRental = monthlyRental + 10;
        explainPetPolicy();
    }

    public static void explainPetPolicy(){
        JOptionPane.showMessageDialog(null, "Any Lease with a Pet has a £10 Extra Pet Fee added "
                + "to the monthly rate");
    }
}
