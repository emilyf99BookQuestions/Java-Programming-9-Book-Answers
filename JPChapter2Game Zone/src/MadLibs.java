
/*. Create a Mad Libs program that asks the user to provide at least four or five
words, and then create and display a short story or nursery rhyme that uses them. */

import javax.swing.*;

public class MadLibs {
    public static void main (String [] args){
        input();
    }

    public static void input(){
        JOptionPane.showMessageDialog(null, "Enter 4 words");
        String wordOne = JOptionPane.showInputDialog(null, "Word One");
        String wordTwo = JOptionPane.showInputDialog(null, "Word Two");
        String wordThree = JOptionPane.showInputDialog(null, "Word Three");
        String wordFour = JOptionPane.showInputDialog(null, "Word Four");

        story(wordOne, wordTwo, wordThree, wordFour);
    }

    public static void story(String one, String two, String three, String four){
        JOptionPane.showMessageDialog(null, "Once upon a time there was a " + one +
                ". Then he fell into a puddle off " + two + ", it was very " + three + ".They dried themselves with" +
                " a " + four + ".");
    }
}
