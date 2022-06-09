
/*Convert the QuartsToGallons program to an interactive application. Instead
of assigning a value to the number of quarts, accept the value from the user as
input. Save the revised program as QuartsToGallonsInteractive.java.*/

import javax.swing.*;

public class QuartsToGallonsInteractive {
    static final int QUARTS = 4;
    static int paintJob = 0;

    public static void main (String [] args){
        explanation();
    }

    public static void explanation(){
        JOptionPane.showMessageDialog(null, "The Program Will Convert Quarts into Gallons");
        String paintJobString = JOptionPane.showInputDialog(null,"Enter your Quarts Amount");
        paintJob = Integer.parseInt(paintJobString);
        calculation(paintJob);
    }

    public static void calculation(int paintJob){
        int gallonsTotal = paintJob / QUARTS;
        int quartsRemainder = paintJob % QUARTS;

        JOptionPane.showMessageDialog(null,paintJob + " Quarts in Gallons is " + gallonsTotal +
                " gallons and " + quartsRemainder + " quarts");

    }
}
