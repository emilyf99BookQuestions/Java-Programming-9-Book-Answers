
/*Write a program that calculates and displays the conversion of an entered number
of dollars into currency denominations—20s, 10s, 5s, and 1s. */

import javax.swing.*;

public class Dollars {

    public static void main (String [] args) {
        input();
    }

    public static void input(){
        String input = JOptionPane.showInputDialog(null, "Enter your Dollar Amount");
        int dollars = Integer.parseInt(input);
        split(dollars);
    }
    public static void split(int dollars){
        int twenties = dollars/20;
        int tens = (dollars - (20 * twenties)) / 10;
        int fives = (dollars - (10 * tens + 20 * twenties)) / 5;
        int ones = (dollars - ( 5 * fives + 10 * tens + 20 * twenties));

        JOptionPane.showMessageDialog(null, "$20s: " + twenties + "\n$10s: " + tens
        + "\n$5s: " + fives + "\n$1s: " + ones);
    }
}
