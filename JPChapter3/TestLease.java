import javax.swing.*;

public class TestLease {

    public static void main(String [] args){
        Lease lease1 = new Lease();
        Lease lease2 = new Lease();
        Lease lease3 = new Lease();
        Lease lease4 = new Lease();

        lease1 = getData();
        lease2 = getData();
        lease3 = getData();

        showData(lease1);
        lease1.addPetFee(lease1);
        showData(lease1);
        showData(lease2);
        showData(lease3);
        showData(lease4);
    }

    public static Lease getData() {
        Lease newLease = new Lease();
        JOptionPane.showMessageDialog(null, "New Lease Details");
        newLease.setTenantsName(JOptionPane.showInputDialog(null, "Tenant Name: "));
        newLease.setApartmentNumber(Integer.parseInt(JOptionPane.showInputDialog(null, "Apartment Number: ")));
        newLease.setMonthlyRental(Double.parseDouble(JOptionPane.showInputDialog(null, "Monthly Rental: ")));
        newLease.setLeaseLengthsMonths(Integer.parseInt(JOptionPane.showInputDialog(null, "Months in Lease: ")));
        return newLease;
    }

    public static void showData(Lease showLease){
        System.out.println("Tenants Name: "+ showLease.getTenantsName() +
                "\nApartment Number: " + showLease.getApartmentNumber() +
                "\nMonthly Rent Amount: "+showLease.getMonthlyRental() +
                "\nTerm of lease: "+ showLease.getLeaseLengthsMonths());
    }

}
