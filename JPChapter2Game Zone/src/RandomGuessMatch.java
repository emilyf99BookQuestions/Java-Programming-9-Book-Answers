
/*Write a program that selects a random number between 1 and 5 and asks
the user to guess the number. Display a message that indicates the difference
between the random number and the user’s guess. Display another message that
displays the random number and the Boolean value true or false depending
on whether the user’s guess equals the random number.*/

import javax.swing.*;


public class RandomGuessMatch {
    public static void main (String [] args){
        int MIN = 1;
        int MAX = 5;
        int random = MIN + (int)(Math.random() * MAX);
        String userGuessString = JOptionPane.showInputDialog("Enter a number between one and five");
        int userGuess = Integer.parseInt(userGuessString);

        int difference = random - userGuess;
        JOptionPane.showMessageDialog(null, "Difference was " + difference);

        if(userGuess == random){
            JOptionPane.showMessageDialog(null, "Number was " + random +"\nTrue");
        }else {
            JOptionPane.showMessageDialog(null, "Number was " + random +"\nFalse");
        }

    }
}
