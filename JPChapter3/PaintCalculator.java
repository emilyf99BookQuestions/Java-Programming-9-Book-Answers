import javax.swing.*;

public class PaintCalculator {

    //A Gallon of paint covers 350 SqrFeet of Wall Space

    public static void main(String[] args){
        double length = 0.0;
        double width = 0.0;
        double height = 0.0;

        JOptionPane.showMessageDialog(null, "Paint Calculator \nEnter the Length, Width and Height of a Room");
        length = Double.parseDouble(JOptionPane.showInputDialog(null, "Length: "));
        width = Double.parseDouble(JOptionPane.showInputDialog(null, "Width: "));
        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Height: "));

        double wallArea = calculateWallArea(length, width, height);
        double[] gallonsAndPrice = calculateGallonsNeeded(wallArea);

        JOptionPane.showMessageDialog(null, "The Total Wall Area is " + wallArea +
                "\nYou Need " + gallonsAndPrice[0] + " gallons of paint.\nThis will Cost £" + gallonsAndPrice[1] + ".");
    }

    public static double calculateWallArea(double length, double width, double height){
        double wallArea = 2*(height * width) + 2*(height * length);
        return wallArea;
    }

    private static double[] calculateGallonsNeeded(double wallArea) {
        double gallonsNeeded = wallArea / 350;
        double costOfPaint = gallonsNeeded * 32;

        double[] gallonsAndPrice = new double[2];
        gallonsAndPrice[0] = gallonsNeeded;
        gallonsAndPrice[1] = costOfPaint;

        return gallonsAndPrice;
    }
}
