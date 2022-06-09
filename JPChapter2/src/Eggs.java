
/*Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges
$3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a
dozen. Write a program that prompts a user for the number of eggs in the
order and then display the amount owed with a full explanation.*/

import javax.swing.*;
import java.text.DecimalFormat;

public class Eggs {
    final static double DOZEN_PRICE = 3.25;
    final static double SINGLE_EGG = 0.45;

    public static void main (String [] args){
        explanation();
    }

    public static void explanation(){
        JOptionPane.showMessageDialog(null, "Enter the amount of Eggs you would like to buy" +
                "\n The program will convert them to Dozens and Singles and then display the price. ");

        String eggsString = JOptionPane.showInputDialog(null, "Eggs");
        int eggs = Integer.parseInt(eggsString);
        calculation(eggs);
    }

    public static void calculation(int eggs){
        DecimalFormat df = new DecimalFormat("###.###");
        int dozens = eggs / 12;
        int remainderEggs = eggs % 12;

        double totalDozensPrice = dozens * DOZEN_PRICE;
        double totalRemainderEggs = remainderEggs * SINGLE_EGG;
        double totalCost = totalDozensPrice + totalRemainderEggs;

        JOptionPane.showMessageDialog(null, dozens + " Dozens and " + remainderEggs +
                " single Eggs");
        JOptionPane.showMessageDialog(null, "Dozen Cost £" + df.format(totalDozensPrice)
                + "\nRemainder Eggs Cost £" + df.format(totalRemainderEggs)+ "\nTotal Cost £" + df.format(totalCost));
    }
}
