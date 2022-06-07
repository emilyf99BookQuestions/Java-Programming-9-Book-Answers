/*Write a Java application that displays two dialog boxes in sequence. The first asks
you to think of a number between 1 and 10. The second displays a randomly
generated number*/

import javax.swing.*;

public class RandomGuess {

    public static void main (String [] args){
        dialogPrompt();
    }

    public static void dialogPrompt(){
        JOptionPane.showMessageDialog(null, "Think of a Number Between 1 and 10");
        randomNumber();
    }

    public static void randomNumber(){
        JOptionPane.showMessageDialog(null,"The number is "+ (1 + (int)(Math.random() * 10)));
    }
}