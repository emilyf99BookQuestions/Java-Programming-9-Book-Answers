import javax.swing.*;

public class Insurance {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Enter the current year and your birth year to calculate" +
                "your annual policy premiums");
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "The Current Year:"));
        int birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Your Birth Year:"));

        int premium = calculatePremium(year, birthYear);
        JOptionPane.showMessageDialog(null, "Your Premium Amount is: £" + premium);
    }

    public static int calculatePremium(int year, int birthyear){
        int decadeOfCustomer = (year - birthyear) / 10;
        int premium = (decadeOfCustomer + 15)* 20;
        return premium;
    }
}
